import { Component } from '@angular/core';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-complaint-list',
  templateUrl: './complaint-list.component.html',
  styleUrls: ['./complaint-list.component.css']
})
export class ComplaintListComponent {
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
