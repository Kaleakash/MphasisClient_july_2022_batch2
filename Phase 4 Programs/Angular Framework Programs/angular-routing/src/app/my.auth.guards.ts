import { Injectable } from "@angular/core";
import { CanActivate, Router } from "@angular/router";

@Injectable()
export class MyAuthGuards implements CanActivate {
    constructor(public router:Router){}
    canActivate() {
        if(sessionStorage.getItem("token")){
                return true;
        }else {
                this.router.navigate(["login"]);
                return false;
        }
    }
}