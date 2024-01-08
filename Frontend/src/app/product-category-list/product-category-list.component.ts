import { Component } from '@angular/core';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-product-category-list',
  templateUrl: './product-category-list.component.html',
  styleUrls: ['./product-category-list.component.css']
})
export class ProductCategoryListComponent {
  productcategorylist:any=[];
  constructor(private service: CrmsService){}
ngOnInit(){
this.getallprodcat();
}
  getallprodcat() {
    this.service.getAllPC().subscribe((res)=>{
     console.log(res);
     this.productcategorylist=res;
    })
  }

}
