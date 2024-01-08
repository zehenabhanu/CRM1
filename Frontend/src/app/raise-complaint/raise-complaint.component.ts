import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-raise-complaint',
  templateUrl: './raise-complaint.component.html',
  styleUrls: ['./raise-complaint.component.css']
})
export class RaiseComplaintComponent {
  rcForm!:FormGroup
  constructor(private service:CrmsService,private fb:FormBuilder){}
  ngOnInit(){
    this.rcForm=this.fb.group({
      pname:[null,Validators.required],
      subject:[null,Validators.required],
      complaint:[null,Validators.required]
    })
  }
  rcfunc(){
this.service.postRaisingComplaint(this.rcForm.value).subscribe((res)=>{
  console.log(res);
  alert("Complaint Raised/Submitted...");
})
  }
}
