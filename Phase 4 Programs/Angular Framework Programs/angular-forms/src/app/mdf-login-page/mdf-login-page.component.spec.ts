import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MdfLoginPageComponent } from './mdf-login-page.component';

describe('MdfLoginPageComponent', () => {
  let component: MdfLoginPageComponent;
  let fixture: ComponentFixture<MdfLoginPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MdfLoginPageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MdfLoginPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
