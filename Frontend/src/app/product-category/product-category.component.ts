import { Component } from '@angular/core';
import { CrmsService } from '../crms.service';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-product-category',
  templateUrl: './product-category.component.html',
  styleUrls: ['./product-category.component.css']
})
export class ProductCategoryComponent {
  pcForm!:FormGroup
  constructor(private service:CrmsService,private fb:FormBuilder){}
  ngOnInit(){
    this.pcForm=this.fb.group({
      pcname:[null,Validators.required],
      description:[null,Validators.required]
    })
  }
  pcfunc(){
   this.service.postProductCategory(this.pcForm.value).subscribe((res)=>{
    console.log(res);
   })
   alert("Product added...");
  }
}
