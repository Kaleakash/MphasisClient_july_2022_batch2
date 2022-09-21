export class CustomService {


    checkUserDetails(login:any):string {
        if(login.email=="raj@gmail.com" && login.pass =="123"){
            return "successfully login";
        } else {
            return "failure try once again";
        }
    }
}