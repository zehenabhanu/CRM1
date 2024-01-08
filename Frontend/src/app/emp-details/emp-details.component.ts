import { Component } from '@angular/core';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent {
  empdetails:any=[];
  constructor(private service : CrmsService){}
  ngOnInit(){
    this.getallempdet();
  }
  getallempdet(){
    this.service.getEmployeeDetails().subscribe((res)=>{
      console.log(res);
      this.empdetails=res;
    })
  }

  delempdet(id:any){
    this.service.deleteEmployeeDetails(id).subscribe((res)=>{
      console.log(res);
      this.getallempdet();
    })
  }
}
