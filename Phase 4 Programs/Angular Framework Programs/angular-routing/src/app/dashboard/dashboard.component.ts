import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  userName:string=""
  // This API is use to receive the value from path param 
  constructor(public activatedRoute:ActivatedRoute,
    public router:Router) { }
  // life cycle of angular we receive the value from angular routing path.
  ngOnInit(): void {
    this.activatedRoute.params.subscribe(data=>this.userName=data.user);
  }

  logout() {
      sessionStorage.removeItem("token");
      this.router.navigate(["login"]);
  }

}
