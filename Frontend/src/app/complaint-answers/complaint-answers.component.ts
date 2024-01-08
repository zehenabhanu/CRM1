import { Component } from '@angular/core';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-complaint-answers',
  templateUrl: './complaint-answers.component.html',
  styleUrls: ['./complaint-answers.component.css']
})
export class ComplaintAnswersComponent {
  newComplaintList:any=[];
  constructor(private service:CrmsService){}
  ngOnInit(){
   this.getAllComplaintList();
  }
  getAllComplaintList(){
    this.service.getAllRaisingComplaint().subscribe((res)=>{
      console.log(res);
      this.newComplaintList=res;
    })
  }

  delcomplaintfunc(id:any){
    this.service.DelRaisingComplaint(id).subscribe((res)=>{
      console.log(res);
      this.getAllComplaintList();
    })
  }
}
