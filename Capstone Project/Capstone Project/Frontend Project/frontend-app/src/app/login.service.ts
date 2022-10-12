import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  baseURL:string ="http://localhost:9090/login";
  constructor(public http:HttpClient) { }

  signIn(login:any):Observable<string> {
    return this.http.post(this.baseURL+"/signIn",login,{responseType:"text"});
  }


  
  signUp(login:any):Observable<string> {
    return this.http.post(this.baseURL+"/signUp",login,{responseType:"text"});
  }
}
