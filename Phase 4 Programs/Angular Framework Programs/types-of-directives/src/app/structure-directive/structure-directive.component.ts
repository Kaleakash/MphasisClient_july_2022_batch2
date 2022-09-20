import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent implements OnInit {
f1:boolean = true;
f2:boolean= false;
f3:boolean = false;
b1:string ="show";
f4:boolean = false;

num1:number[]=[10,20,30,40,50];
names:string[]=["Ravi","Ramesh","Ajay","Vikash","Vijay","Mahesh"]

  constructor() { }
  ngOnInit(): void {
  }
  changeValue(){
    this.f3=true;
  }

  toggle() {
    if(this.f4){
        this.f4=false;
        this.b1="show";
    }else {
      this.f4=true;
      this.b1 = "hide"
    }
  }
}
