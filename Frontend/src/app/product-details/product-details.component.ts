import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent {
  pdForm!:FormGroup
  constructor(private service:CrmsService,private fb:FormBuilder){}
  ngOnInit(){
    this.pdForm=this.fb.group({
      pcode:[null,Validators.required],
      pdname:[null,Validators.required],
      details:[null,Validators.required],
      pcategory:[null,Validators.required],
      price:[null,Validators.required]
    })
  }
  pdfunc(){
    this.service.postProductDetails(this.pdForm.value).subscribe((res)=>{
      console.log(res);
      alert("Form Submitted..")
    })
  }
}
