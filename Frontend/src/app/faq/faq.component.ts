import { Component } from '@angular/core';
import { CrmsService } from '../crms.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-faq',
  templateUrl: './faq.component.html',
  styleUrls: ['./faq.component.css']
})
export class FAQComponent {
  faqForm!:FormGroup
  constructor(private service : CrmsService, private fb:FormBuilder){}
  ngOnInit(){
    this.faqForm=this.fb.group({
      question:[null,Validators.required],
      answer:[null,Validators.required]
    })
  }
  faqfun(){
   this.service.postFAQ(this.faqForm.value).subscribe((res)=>{
    console.log(res);
    alert("FAQ Added..");
   })
  }
}
