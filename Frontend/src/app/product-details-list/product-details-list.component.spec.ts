import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductDetailsListComponent } from './product-details-list.component';

describe('ProductDetailsListComponent', () => {
  let component: ProductDetailsListComponent;
  let fixture: ComponentFixture<ProductDetailsListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProductDetailsListComponent]
    });
    fixture = TestBed.createComponent(ProductDetailsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
