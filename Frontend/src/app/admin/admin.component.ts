import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Admin } from '../user';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {

  admin:Admin=new Admin();
  constructor(private route:Router,private service:CrmsService){}
  ngOnInit(){

  }
  adminLogin(){
    this.service.postadminLogin(this.admin).subscribe((res)=>{
      console.log(res);   
        alert("Login successfully");     
      this.route.navigateByUrl("/admindetails");
    },error=>alert("Please enter Correct UserId or Password")
    )   
  }

  /*
  postAdminForm!: FormGroup
  constructor(private route: Router,private fb:FormBuilder){}

  ngOnInit():any{
    this.postAdminForm=this.fb.group(
      {
        aname:[null,Validators.required],
        password:[null,Validators.required]
      }
    )
  }
  adminLogin(){
    console.log(this.postAdminForm.value)
  this.route.navigateByUrl("/admindetails");
  }
*/
}
