import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-string-interpolation',
  templateUrl: './string-interpolation.component.html',
  styleUrls: ['./string-interpolation.component.css']
})
export class StringInterpolationComponent implements OnInit {
  fname:string ="Ajay";

  constructor() { }

  ngOnInit(): void {
  }

  display() {
    return "Welcome "+this.fname;
  }
  
  add(a:number,b:number):number{
    return a+b;
  }
}
