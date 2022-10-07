import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  products:Array<Product>=[];
  constructor(public ps:ProductService) { }

  ngOnInit(): void {
    this.loadAllProduct();
  }

  loadAllProduct() {
    //this.ps.loadAllProduct().subscribe(data=>this.products=data,error=>console.log(error),()=>console.log("completed"))
    this.ps.loadAllProduct().subscribe({
      next:(result:any)=>this.products=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    });
  }

}
