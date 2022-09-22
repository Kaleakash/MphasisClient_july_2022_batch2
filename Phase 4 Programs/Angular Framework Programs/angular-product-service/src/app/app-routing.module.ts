import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductOperationComponent } from './product-operation/product-operation.component';
import { ProductComponent } from './product/product.component';

const routes: Routes = [
  {path:"product",component:ProductComponent},
  {path:"product-operation",component:ProductOperationComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
