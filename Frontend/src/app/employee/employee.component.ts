import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {
  empForm!:FormGroup
constructor(private route:Router,private fb: FormBuilder){}
ngOnInit(){
  this.empForm=this.fb.group({
    ename:[null,Validators.required],
    password:[null,Validators.required]
  })
}
EmpLogin(){
console.log(this.empForm.value);
this.route.navigateByUrl("/EmpPage");
}
}
