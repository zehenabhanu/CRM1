import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {
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
}
