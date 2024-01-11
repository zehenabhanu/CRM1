import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CrmsComponent } from './crms/crms.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { AdminComponent } from './admin/admin.component';
import { EmployeeComponent } from './employee/employee.component';
import { UserComponent } from './user/user.component';
import { AdminDetailsComponent } from './admin-details/admin-details.component';
import { ProductCategoryComponent } from './product-category/product-category.component';
import { UserPageComponent } from './user-page/user-page.component';
import { ProductCategoryListComponent } from './product-category-list/product-category-list.component';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { ProductDetailsListComponent } from './product-details-list/product-details-list.component';
import { RaiseComplaintComponent } from './raise-complaint/raise-complaint.component';
import { EmpPageComponent } from './emp-page/emp-page.component';
import { ComplaintListComponent } from './complaint-list/complaint-list.component';
import { UpdatecomplaintComponent } from './updatecomplaint/updatecomplaint.component';
import { FAQComponent } from './faq/faq.component';
import { FaqListComponent } from './faq-list/faq-list.component';
import { EmpDetailsComponent } from './emp-details/emp-details.component';

const routes: Routes = [
  {path:'crms',component:CrmsComponent},
  {path:'',redirectTo:'/crms',pathMatch:'full'},
  {path:'login',component:LoginComponent},
  {path:'signup',component:SignupComponent},
  {path:'admin',component:AdminComponent},
  {path:'employee',component:EmployeeComponent},
  {path:'user',component:UserComponent},
  {path:'admindetails',component:AdminDetailsComponent},
  {path:'productcategory',component:ProductCategoryComponent},
  {path:'userpage',component:UserPageComponent},
  {path:'ProductCategoryList',component:ProductCategoryListComponent},
  {path:'ProductDetails',component:ProductDetailsComponent},
  {path:'ProductDetailsList',component:ProductDetailsListComponent},
  {path:'RaiseComplaint',component:RaiseComplaintComponent},
  {path:'EmpPage',component:EmpPageComponent},
  {path:'ComplaintList',component:ComplaintListComponent},
  {path:'RaiseComplaint/:id',component:UpdatecomplaintComponent},
  {path:'FAQ',component:FAQComponent},
  {path:'FaqList',component:FaqListComponent},
  {path:'EmpDetails',component:EmpDetailsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
