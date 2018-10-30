import { Injectable, RendererFactory2 } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

/**
 * User input validating service.
 */
@Injectable()
export class ValidatorService {
  readonly categories: string[]  = ['business', 'general', 'science', 'entertainment', 'sports', 'technology', 'health'];

  /**
 * Checks if category supplied is valid.
 * @param category should be one of "business, general, science, entertainment, sports, technology, health".
 */
  public isCategoryValid(category: string) {
    for (const value of this.categories) {
      if (value === category) {
        return true;
      }
    }
    return false;

  }


  constructor() { }


}
