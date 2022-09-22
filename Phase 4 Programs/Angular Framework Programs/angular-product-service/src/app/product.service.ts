import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'  // provider attribute in app.module.ts service class available in root level. 
})
export class ProductService {

  constructor(public http:HttpClient) { }

  // loadProductData(){
  //   this.http.get("http://localhost:3000/products").subscribe({
  //     next:(data:any)=>console.log(data),
  //      error:(error:any)=>console.log(error),
  //     complete:()=>console.log("Completed")
  //   })
  // }

  // we return Observable with array of product ie typecasting 
  loadProductData():Observable<Product[]>{
    return this.http.get<Product[]>("http://localhost:3000/products");
  }

  // in post method 1st parameter url and 2nd parameter data in json format. 
  storeProductData(product:any):Observable<Product>{
    return this.http.post<Product>("http://localhost:3000/products",product);
  }

  // it is consider as path param 
  findProductById(id:any):Observable<Product>{
    return this.http.get<Product>("http://localhost:3000/products/"+id);
  }

  // it will delete using path param 
  delete(id:any):Observable<any>{
    return this.http.delete<any>("http://localhost:3000/products/"+id);
  }

   // in post method 1st parameter url and 2nd parameter data in json format. 
   updateProduct(product:any):Observable<Product>{
    return this.http.put<Product>("http://localhost:3000/products",product);
  }

  
}
