import { Component } from '@angular/core';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-product-details-list',
  templateUrl: './product-details-list.component.html',
  styleUrls: ['./product-details-list.component.css']
})
export class ProductDetailsListComponent {
  productdetails:any=[];
  constructor(private service:CrmsService){}
  ngOnInit(){
   this.getallproductdetails();
  }
  getallproductdetails(){
    this.service.getProductDetails().subscribe((res)=>{
      console.log(res);
      this.productdetails=res;
    })
  }
}
