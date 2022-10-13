import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms'
import { ProductService } from '../product.service';
@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  productRef = new FormGroup({
    pname:new FormControl(),
    price:new FormControl(),
    url:new FormControl()
  })
  storeMsg :string =""
  constructor(public ps:ProductService) { }

  ngOnInit(): void {
  }

  storeProduct() {
    let product = this.productRef.value;
    this.ps.storeProduct(product).subscribe({
      next:(result:any)=>this.storeMsg=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })

    this.productRef.reset();
  }

}
