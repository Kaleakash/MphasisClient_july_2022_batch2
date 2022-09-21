import {Injectable} from '@angular/core'

@Injectable()                           // this annotation we write on service class 
export class LoginService {

    checkUserDetails(login:any):string {
        if(login.email=="raj@gmail.com" && login.pass =="123"){
            return "successfully login";
        } else {
            return "failure try once again";
        }
    }

}