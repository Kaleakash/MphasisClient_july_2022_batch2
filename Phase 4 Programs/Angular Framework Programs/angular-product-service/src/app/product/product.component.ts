import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';
import {FormGroup,FormControl} from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  
  productRef= new FormGroup({
    id:new FormControl(),
    pname:new FormControl(),
    price:new FormControl()
  });

  products:Array<Product>=[]
  constructor(public ps:ProductService,public router:Router) { }     // DI for ProductService 

  // it will call only once from here i am calling loadProductDetails() 
  ngOnInit(): void {
    this.loadProductDetails();    
  }
  loadProductDetails() {
    //this.ps.loadProductData();
    this.ps.loadProductData().subscribe({
      next:(data:any)=>this.products=data,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("Completed")
    })

  }
  storeProduct(){
    let product = this.productRef.value;
    this.ps.storeProductData(product).subscribe({
      next:(data:any)=>console.log(data),
      error:(error:any)=>console.log(error),
      complete:()=>this.loadProductDetails()
    })
    this.productRef.reset();
  }

  viewDetails(product:any){
    sessionStorage.setItem("productInfo",JSON.stringify(product));
    this.router.navigate(["product-operation"]);
  }

}
