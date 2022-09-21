import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginRef = new FormGroup({
    user:new FormControl(),
    pass:new FormControl()
  })
  constructor(public loginSer:LoginService,
  public router:Router) { }   //DI for Service class. 
  msg:string="";
  ngOnInit(): void {
  }
  checkUser() {
    let login = this.loginRef.value;
     this.loginSer.checkUser().subscribe(result=> {
        let message = result.find(l=>l.user==login.user && l.pass==login.pass);
        if(message==undefined){
            this.msg = "Invalid username or password"
        }else {
          // in reponse after success message from server. 
          //Server side technologies 
          //provide you unique id ie session id.
          // JWT (json web token)
          sessionStorage.setItem("token",login.user); 
          this.router.navigate(["home",login.user]);  // append data through url    
        }
      },error=>console.log(error));  
      this.loginRef.reset(); 
  }
  
}
