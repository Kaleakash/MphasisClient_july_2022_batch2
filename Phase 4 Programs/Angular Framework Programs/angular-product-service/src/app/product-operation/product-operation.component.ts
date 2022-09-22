import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-operation',
  templateUrl: './product-operation.component.html',
  styleUrls: ['./product-operation.component.css']
})
export class ProductOperationComponent implements OnInit {
  product:any;
  constructor(public router:Router,public ps:ProductService) { }

  ngOnInit(): void {
    let obj = sessionStorage.getItem("productInfo");
    if(obj != null){
        this.product= JSON.parse(obj);
    }
  }

  ViewAll(){
      this.router.navigate(["product"]);
  }

  deleteProduct(id:any){
      this.ps.delete(id).subscribe({
        next:(result:any)=>console.log(result),
        error:(error:any)=>console.log(error),
        complete:()=>console.log("completed")
      })
  }
}
