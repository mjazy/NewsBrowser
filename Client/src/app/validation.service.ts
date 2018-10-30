import { Injectable, RendererFactory2 } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ValidationService {
  readonly categories: String[]  = ['business', 'general', 'science', 'entertainment', 'sports', 'technology', 'health'];

  public isCategoryValid(category: string) {
    for (const value of this.categories) {
      if (value === category) {
        return true;
      }
      return false;
    }

  }


  constructor() { }


}
