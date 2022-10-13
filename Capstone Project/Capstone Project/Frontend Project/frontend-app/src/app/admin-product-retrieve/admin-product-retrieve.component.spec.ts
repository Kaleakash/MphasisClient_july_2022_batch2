import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminProductRetrieveComponent } from './admin-product-retrieve.component';

describe('AdminProductRetrieveComponent', () => {
  let component: AdminProductRetrieveComponent;
  let fixture: ComponentFixture<AdminProductRetrieveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminProductRetrieveComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminProductRetrieveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
