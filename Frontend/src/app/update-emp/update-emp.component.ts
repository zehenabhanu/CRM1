import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-update-emp',
  templateUrl: './update-emp.component.html',
  styleUrls: ['./update-emp.component.css']
})
export class UpdateEmpComponent {
  updateEmpForm!:FormGroup;
  id: number=this.activatedroute.snapshot.params['id'];
  constructor(private activatedroute: ActivatedRoute,private service: CrmsService,private fb:FormBuilder,private route:Router){}
  ngOnInit(){
    this.updateEmpForm=this.fb.group({
     name:[null,Validators.required],
     email:[null,Validators.required,Validators.email],
     phone:[null,Validators.required]
    })
    this.getEmpById();
  }

  getEmpById(){
    this.service.getbyidEmployeeDetails(this.id).subscribe((res)=>{
      console.log(res);
      this.updateEmpForm.patchValue(res);
    })
  }

  updateEmp(){
   this.service.putEmployeeDetails(this.id,this.updateEmpForm.value).subscribe((res)=>{
    console.log(res);
    this.route.navigateByUrl("/EmpDetails");
   })
  }
}
