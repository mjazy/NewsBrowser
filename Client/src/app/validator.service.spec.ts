import { TestBed } from '@angular/core/testing';

import { ValidatorService } from './validator.service';

describe('ValidatorService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ValidatorService = TestBed.get(ValidatorService);
    expect(service).toBeTruthy();
  });

  it('should return false', () => {
    const service: ValidatorService = TestBed.get(ValidatorService);
    expect(service.isCategoryValid('') === false);
    expect(service.isCategoryValid('test') === false);
    expect(service.isCategoryValid(null) === false);
  });

  it('should return true', () => {
    const service: ValidatorService = TestBed.get(ValidatorService);
    expect(service.isCategoryValid('business') === true);
    expect(service.isCategoryValid('general') === true);
    expect(service.isCategoryValid('science') === true);
    expect(service.isCategoryValid('entertainment') === true);
    expect(service.isCategoryValid('sports') === true);
    expect(service.isCategoryValid('technology') === true);
    expect(service.isCategoryValid('health') === true);
  });


});
