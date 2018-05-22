import { Injectable } from '@angular/core';
import {observable, of, Observable } from 'rxjs';
import { Employees } from './EmployeeList';
import { EmployeeModel } from './EmployeeModel';
import { HttpClient ,HttpHeaders, HttpClientModule } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {
  private resturl = 'http://localhost:8080/CEBProjectRestDemo/api/employee';

 getemployee(): Observable<EmployeeModel[]>{
   return this.http.get<EmployeeModel[]>(this.resturl);
 }
  constructor(private http :HttpClient) { }
}
