import { TestBed } from '@angular/core/testing';

import { CrmsService } from './crms.service';

describe('CrmsService', () => {
  let service: CrmsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CrmsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
