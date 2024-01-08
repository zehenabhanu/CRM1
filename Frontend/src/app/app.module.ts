import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { CrmsComponent } from './crms/crms.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { EmployeeComponent } from './employee/employee.component';
import { ProductCategoryComponent } from './product-category/product-category.component';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { EmpDetailsComponent } from './emp-details/emp-details.component';
import { AdminDetailsComponent } from './admin-details/admin-details.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProductCategoryListComponent } from './product-category-list/product-category-list.component';
import { UserPageComponent } from './user-page/user-page.component';
import { ProductDetailsListComponent } from './product-details-list/product-details-list.component';
import { FAQComponent } from './faq/faq.component';
import { RaiseComplaintComponent } from './raise-complaint/raise-complaint.component';
import { EmpPageComponent } from './emp-page/emp-page.component';
import { ComplaintListComponent } from './complaint-list/complaint-list.component';
import { UpdatecomplaintComponent } from './updatecomplaint/updatecomplaint.component';
import { FaqListComponent } from './faq-list/faq-list.component';
import { UpdateEmpComponent } from './update-emp/update-emp.component';


@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    LoginComponent,
    CrmsComponent,
    AdminComponent,
    UserComponent,
    EmployeeComponent,
    ProductCategoryComponent,
    ProductDetailsComponent,
    EmpDetailsComponent,
    AdminDetailsComponent,
    ProductCategoryListComponent,
    UserPageComponent,
    ProductDetailsListComponent,
    FAQComponent,
    RaiseComplaintComponent,
    EmpPageComponent,
    ComplaintListComponent,
    UpdatecomplaintComponent,
    FaqListComponent,
    UpdateEmpComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
