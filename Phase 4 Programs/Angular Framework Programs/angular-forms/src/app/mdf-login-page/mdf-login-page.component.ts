import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-mdf-login-page',
  templateUrl: './mdf-login-page.component.html',
  styleUrls: ['./mdf-login-page.component.css']
})
export class MdfLoginPageComponent implements OnInit {
  loginRef = new FormGroup({
    email:new FormControl("",[Validators.required]),    // 1st parameter is value option in textfield 
    pass:new FormControl("",[Validators.required])
  });

  msg:string="";
  constructor() { }

  ngOnInit(): void {
  }

  checkUser(){
    let login = this.loginRef.value;
    //console.log(login);
    if(login.email=="raj@gmail.com" && login.pass=="123"){
      this.msg = "Successfully login"
    }else {
        this.msg = "Failure try once again"
    }
    this.loginRef.reset();
  }
}
