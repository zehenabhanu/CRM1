import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
  userForm!:FormGroup
constructor(private route: Router,service:CrmsService,private fb: FormBuilder){}
ngOnInit(){
  this.userForm=this.fb.group({
    uname:[null,Validators.required],
   password:[null,Validators.required]
  })
}
userLogin(){
  console.log(this.userForm.value);
  this.route.navigateByUrl("/userpage");
}


}
 /* userForm!:FormGroup
constructor(private route: Router,service:CrmsService,private fb: FormBuilder){}
ngOnInit(){
  this.userForm=this.fb.group({
    uname:[null,Validators.required],
   password:[null,Validators.required]
  })
}
userLogin(){
  console.log(this.userForm.value);
  this.route.navigateByUrl("/userpage");
}*/

// login.component.ts

// login.component.ts


  