import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpPageComponent } from './emp-page.component';

describe('EmpPageComponent', () => {
  let component: EmpPageComponent;
  let fixture: ComponentFixture<EmpPageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EmpPageComponent]
    });
    fixture = TestBed.createComponent(EmpPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
