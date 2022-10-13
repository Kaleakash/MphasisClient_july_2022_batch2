import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  baseUrl:string ="http://localhost:9090/product"
  constructor(public http:HttpClient) { }

  storeProduct(product:any):Observable<string> {
    return this.http.post(this.baseUrl+"/storeProduct",product,{responseType:"text"});
  }
  updateProduct(product:any):Observable<string> {
    return this.http.patch(this.baseUrl+"/updateProduct",product,{responseType:"text"});
  }

  findAllProduct():Observable<Product[]> {
    return this.http.get<Product[]>(this.baseUrl+"/findAllProduct");
  }

  findAllProductByPrice(price:number):Observable<Product[]> {
    return this.http.get<Product[]>(this.baseUrl+"/findProductByPrice/"+price);
  }

  findAllProductById(pid:number):Observable<string> {
    return this.http.get(this.baseUrl+"/findAllProduct/"+pid,{responseType:"text"});
  }
  deleteProductById(pid:number):Observable<string> {
    return this.http.delete(this.baseUrl+"/deleteProduct/"+pid,{responseType:"text"});
  }

}
