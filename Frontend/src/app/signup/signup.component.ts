import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CrmsService } from '../crms.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  signupForm!:FormGroup
  constructor(private service: CrmsService,private fb: FormBuilder,private route: Router){}
  ngOnInit(){
    this.signupForm=this.fb.group({
      name:[null,Validators.required],
      mbl:[null,Validators.required],
      email:[null,Validators.required,Validators.email],
      address:[null,Validators.required],
      username:[null,Validators.required],
      password:[null,Validators.required],
      cpassword:[null,Validators.required]
    })
  }
  signupfunc(){
   this.service.postUser(this.signupForm.value).subscribe((res)=>
   {
    console.log(res);
    alert("Thank you for Registration..")
   this.route.navigateByUrl("/login");
   })
  }

  // signup.component.ts

}