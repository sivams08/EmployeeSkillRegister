import { Component, OnInit } from '@angular/core';
import { Employees } from '../EmployeeList';
import { EmployeeModel } from '../EmployeeModel';
import { EmployeeServiceService } from '../employee-service.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  employee:EmployeeModel[];

  constructor(private EmpService :EmployeeServiceService) { }
  
  getemployee(): void {
    this.EmpService.getemployee()
    .subscribe(emp => this.employee = emp);
  }
  ngOnInit() {
    this.getemployee();
  }

}
