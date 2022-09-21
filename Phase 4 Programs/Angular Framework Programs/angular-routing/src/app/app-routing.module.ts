import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginComponent } from './login/login.component';
import { MyAuthGuards } from './my.auth.guards';
import { NotfoundComponent } from './notfound/notfound.component';
import { Sub1Component } from './sub1/sub1.component';
import { Sub2Component } from './sub2/sub2.component';
import { Sub3Component } from './sub3/sub3.component';

// we can write rules which help to nagivate from one 
// component to another component. 
// http://localhost:4200/aboutus
const routes: Routes = [
  {path:"aboutus",component:AboutUsComponent},
  {path:"contactus",component:ContactUsComponent},
  {path:"login",component:LoginComponent},
// :user is a variable which help to receive the username value from path.
  {path:"home/:user",component:DashboardComponent,canActivate:[MyAuthGuards],
  children:
  [
    {path:"sub1",component:Sub1Component},
    {path:"sub2",component:Sub2Component},
    {path:"sub3",component:Sub3Component},
  ]} ,
  {path:"",redirectTo:"login",pathMatch:"full"},
  {path:"**",component:NotfoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
