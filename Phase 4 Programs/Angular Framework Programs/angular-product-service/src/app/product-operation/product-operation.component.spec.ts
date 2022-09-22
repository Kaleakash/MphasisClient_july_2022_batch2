import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductOperationComponent } from './product-operation.component';

describe('ProductOperationComponent', () => {
  let component: ProductOperationComponent;
  let fixture: ComponentFixture<ProductOperationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductOperationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductOperationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
