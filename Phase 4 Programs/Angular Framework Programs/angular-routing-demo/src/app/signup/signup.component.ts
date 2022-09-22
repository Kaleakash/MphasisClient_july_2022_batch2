import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { Router } from '@angular/router';
import { Login } from '../login';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
loginRef = new FormGroup({
  email:new FormControl(),
  pass:new FormControl()
}) 
msg:string =""
loginDetails:Array<Login>=[]
  constructor() { }
  ngOnInit(): void {
  }

  createAccount(){
    let login = this.loginRef.value;
    let l  = {email:login.email,pass:login.pass};     // literal style object 
     let result = this.loginDetails.find(obj=>obj.email==l.email);
    if(result==undefined){
     this.loginDetails.push(l);
    sessionStorage.setItem("loginInfo",JSON.stringify(this.loginDetails));      //
    this.msg = "Account Created successsfully"; 
    } else {
      this.msg = "Email Id must be unqiue";
    }

    this.loginRef.reset();
  }

}
