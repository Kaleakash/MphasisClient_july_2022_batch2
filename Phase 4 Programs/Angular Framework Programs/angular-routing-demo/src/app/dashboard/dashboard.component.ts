import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  user:string =""
  constructor() { }

  ngOnInit(): void {
    let obj = sessionStorage.getItem("user");
    if(obj != null){
        this.user  = obj;
    }
  }

}
