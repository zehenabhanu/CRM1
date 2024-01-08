import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CrmsComponent } from './crms.component';

describe('CrmsComponent', () => {
  let component: CrmsComponent;
  let fixture: ComponentFixture<CrmsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CrmsComponent]
    });
    fixture = TestBed.createComponent(CrmsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
