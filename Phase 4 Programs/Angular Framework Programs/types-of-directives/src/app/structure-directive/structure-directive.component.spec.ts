import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StructureDirectiveComponent } from './structure-directive.component';

describe('StructureDirectiveComponent', () => {
  let component: StructureDirectiveComponent;
  let fixture: ComponentFixture<StructureDirectiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StructureDirectiveComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StructureDirectiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
