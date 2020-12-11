import { TestBed } from '@angular/core/testing';

import { TropaService } from './tropa.service';

describe('TropaService', () => {
  let service: TropaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TropaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
