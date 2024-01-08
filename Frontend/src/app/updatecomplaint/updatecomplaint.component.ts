import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-updatecomplaint',
  templateUrl: './updatecomplaint.component.html',
  styleUrls: ['./updatecomplaint.component.css']
})
export class UpdatecomplaintComponent {
  updateComplaintForm!:FormGroup;
  id: number=this.activatedRoute.snapshot.params['id'];
 constructor(private activatedRoute:ActivatedRoute, 
  private service: CrmsService,private fb: FormBuilder,private route: Router){}
  ngOnInit()
    {
      this.updateComplaintForm=this.fb.group(
        {
          pname:[null,Validators.required],
          subject:[null,Validators.required],
          complaint:[null,Validators.required]
        }
      )
      this.getComplaintById();
    }
  getComplaintById() {
    this.service.getRaisingComplaint(this.id).subscribe((res)=>{
      console.log(res);
      this.updateComplaintForm.patchValue(res);
    })
  }

  updateComplaint(){
    this.service.putRaisingComplaint(this.id,this.updateComplaintForm.value).subscribe((res)=>{
      console.log(res);
      this.route.navigateByUrl("/ComplaintList");
    })
  }
}
