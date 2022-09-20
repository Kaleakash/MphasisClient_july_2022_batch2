
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tdf-login-page',
  templateUrl: './tdf-login-page.component.html',
  styleUrls: ['./tdf-login-page.component.css']
})
export class TdfLoginPageComponent implements OnInit {
  msg:string =""
  constructor() { }

  ngOnInit(): void {
  }

  checkUser(loginRef:any){
    //console.log(loginRef)
    let login = loginRef.value;
    //console.log(login);
    if(login.email=="raj@gmail.com" && login.pass=="123"){
        this.msg = "Successfully login"
    }else {
        this.msg = "Failure try once again";
    }

    loginRef.reset();
  }
}
