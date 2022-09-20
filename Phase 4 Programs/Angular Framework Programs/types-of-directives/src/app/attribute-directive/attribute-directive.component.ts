import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attribute-directive',
  templateUrl: './attribute-directive.component.html',
  styleUrls: ['./attribute-directive.component.css']
})
export class AttributeDirectiveComponent implements OnInit {
  styleVariable ={'color':'red'}
  f1:boolean = true;
  f2:boolean = false;
  constructor() { }

  ngOnInit(): void {
  }

  ff1() {
    this.f1= false;
    this.f2 = true;
  }
  ff2() {
    this.f2 = false;
    this.f1 = true;
  }
}
