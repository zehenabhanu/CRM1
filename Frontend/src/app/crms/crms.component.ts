import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-crms',
  templateUrl: './crms.component.html',
  styleUrls: ['./crms.component.css']
})
export class CrmsComponent {
  crmsForm!: FormGroup
  constructor(private service:CrmsService,private fb:FormBuilder){}
  ngOnInit(){
    this.crmsForm=this.fb.group({
     fname:[null,Validators.required],
     lname:[null,Validators.required],
     email:[null,Validators.required],
     phone:[null,Validators.required],
     country:[null,Validators.required]
    })
  }
  crmsFunc(){
   this.service.postDemoData(this.crmsForm.value).subscribe((res)=>{
    console.log(res);
    alert("Form Submitted.. Check your Email for Latest updates of Demo class");
    
   })
  }
}
