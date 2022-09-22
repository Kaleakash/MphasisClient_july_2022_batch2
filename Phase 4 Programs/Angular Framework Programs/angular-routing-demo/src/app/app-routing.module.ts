import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';

// we have to write navigation rules 
// http://localhost:4200
const routes: Routes = [
  {path:"aboutus",component:AboutUsComponent},
  {path:"contactus",component:ContactUsComponent},
  {path:"feedback",component:FeedbackComponent},
  {path:"login",component:LoginComponent},
  {path:"home",component:DashboardComponent},
  {path:"login/signUp",component:SignupComponent},
  {path:"login/signUp/signIn",component:LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
