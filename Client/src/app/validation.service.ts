import { Injectable, RendererFactory2 } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

@Injectable()
export class ValidationService {
  readonly categories: string[]  = ['business', 'general', 'science', 'entertainment', 'sports', 'technology', 'health'];

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
