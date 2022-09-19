import { Component } from '@angular/core';

@Component({
  selector: 'app-root',         // <app-root></app-root>
  templateUrl: './app.component.html',      // connect to html page 
  styleUrls: ['./app.component.css']      // connect to html page 
})
export class AppComponent {
  id:number =100;
  name:string = "Raj Deep";
  age:number =21;
  result: boolean = true;
}
