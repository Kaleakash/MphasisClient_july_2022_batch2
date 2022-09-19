import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {

  lname:string ="Deep";
  f1:boolean = false;
  constructor() { }

  ngOnInit(): void {
  }

}
