import { Component } from '@angular/core';
import { CrmsService } from '../crms.service';

@Component({
  selector: 'app-faq-list',
  templateUrl: './faq-list.component.html',
  styleUrls: ['./faq-list.component.css']
})
export class FaqListComponent {
  FAQs:any=[];
  constructor(private service:CrmsService){}
  ngOnInit(){
   this.getAllFAQ();
  }
  getAllFAQ(){
    this.service.getFAQ().subscribe((res)=>{
      console.log(res);
      this.FAQs=res;
    })
  }
}
