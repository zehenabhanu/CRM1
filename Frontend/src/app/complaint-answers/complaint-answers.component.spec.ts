import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComplaintAnswersComponent } from './complaint-answers.component';

describe('ComplaintAnswersComponent', () => {
  let component: ComplaintAnswersComponent;
  let fixture: ComponentFixture<ComplaintAnswersComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ComplaintAnswersComponent]
    });
    fixture = TestBed.createComponent(ComplaintAnswersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
