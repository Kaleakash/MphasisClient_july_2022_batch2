import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-admin-product-retrieve',
  templateUrl: './admin-product-retrieve.component.html',
  styleUrls: ['./admin-product-retrieve.component.css']
})
export class AdminProductRetrieveComponent implements OnInit {

  products:Array<Product>=[];
  constructor(public ps:ProductService) { }

  ngOnInit(): void {
    this.findAllProduct();
  }
  flag:boolean = false;
  pid:number =0;
  price:number =0;
  url:string ="";
  findAllProduct() {
    this.ps.findAllProduct().subscribe({
      next:(result:any)=>this.products=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
  }

  deleteProduct(pid:number){
    //console.log(pid)
    this.ps.deleteProductById(pid).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{
          this.findAllProduct();   
      }
    })
  }

  updateProduct(product:any){
      this.flag= true;
      this.pid=product.pid;
      this.price=product.price;
      this.url=product.url;
  }

  updateDataFromDb(){
    let product = {pid:this.pid,price:this.price,url:this.url};
    this.ps.updateProduct(product).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{
          this.findAllProduct();   
      }
    })
    this.flag=false;
  }
}
