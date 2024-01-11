import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Emp } from '../user';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {

  emp:Emp=new Emp();
  constructor(private route:Router,private service:CrmsService){}
  ngOnInit(){

  }
  empLogin(){
    this.service.postempLogin(this.emp).subscribe((res)=>{
      console.log(res);
      alert("Login successfully");
      this.route.navigateByUrl("/EmpPage");
    },error=>alert("Please enter Correct UserId or Password")
    )   
  }

  /*empForm!:FormGroup
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
}*/
}
