import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
const BASIC_URL=["http://localhost:8080"];
@Injectable({
  providedIn: 'root'
})
export class CrmsService {

  constructor(private http: HttpClient) { }
  
  postProductCategory(ProductCategory:any):Observable<any>{
    return this.http.post(BASIC_URL + "/pc/add", ProductCategory);
  }

  postUser(user:any):Observable<any>{
    return this.http.post(BASIC_URL+"/user/add",user);
  }

  postProductDetails(ProductDetails:any):Observable<any>{
    return this.http.post(BASIC_URL + "/pd/add", ProductDetails);
  }

  postRaisingComplaint(RaisingComplaint:any):Observable<any>{
    return this.http.post(BASIC_URL+"/rc/add",RaisingComplaint);
  }

  postDemoData(demodata:any):Observable<any>{
    return this.http.post(BASIC_URL+"/dd/add",demodata);
  }

  getAllPC():Observable<any>{
    return this.http.get(BASIC_URL+"/pc/all");
  }

  getProductDetails():Observable<any>{
  return this.http.get(BASIC_URL + "/pd/all");
  }

  getAllRaisingComplaint():Observable<any>{
   return this.http.get(BASIC_URL+"/rc/all");
  }

  DelRaisingComplaint(id:any):Observable<any>{
    return this.http.delete(BASIC_URL+"/rc/"+id);
  }

  getRaisingComplaint(id:any):Observable<any>{
    return this.http.delete(BASIC_URL+"/rc/get/"+id);
  }

  putRaisingComplaint(id:any,RaisingComplaint:any):Observable<any>{
    return this.http.put(BASIC_URL+"/rc/put/"+id,RaisingComplaint)
  }

  postFAQ(faq:any):Observable<any>{
    return this.http.post(BASIC_URL+"/faq/add",faq);
  }

  getFAQ():Observable<any>{
    return this.http.get(BASIC_URL+"/faq/all");
  }

  getEmployeeDetails():Observable<any>{
    return this.http.get(BASIC_URL+"/emp/all");
  }

  deleteEmployeeDetails(id:any):Observable<any>{
    return this.http.delete(BASIC_URL+"/emp/del/"+id);
  }

  getbyidEmployeeDetails(id:any):Observable<any>{
    return this.http.get(BASIC_URL+"/emp/get/"+id);
  }

  putEmployeeDetails(id:any,empDet:any):Observable<any>{
    return this.http.put(BASIC_URL+"/emp/put/"+id,empDet);
  }
}
