import { FetcherService } from './fetcher.service';
import { ValidationService } from './validation.service';
import { Component, Inject } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})



export class AppComponent {
  title = 'Client';
  fetchNewsResponse: News;


    fetchNews(category: string) {
      if (this.validationService.isCategoryValid(category)) {
        this.fetcherService.fetchNews(category);
        this.fetchNewsResponse = this.fetcherService.fetchNewsResponse;
      }
    }

  constructor(private validationService: ValidationService, private fetcherService: FetcherService) {
    }
  }


export interface Article {
  author: string;
  title: string;
  description: string;
  date: string;
  sourceName: string;
  aritlceUrl: string;
  imageUrl: string;
}
export interface News {
  country: string;
  category: string;
  articles: Array<Article>;
}
