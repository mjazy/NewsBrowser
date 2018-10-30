import { Component, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  title = 'Client';
  fetchNewsResponse: News;
  readonly country: String = 'pl';

  fetchNews(category: string) {
    this.httpClient.get<News>('http://localhost:8080/news/' + this.country + '/' + category + '/')
    .subscribe(data => this.fetchNewsResponse = data);
    console.log(this.fetchNewsResponse);
  }

    // Client side validation function that should occur before sending request to server.


  constructor(@Inject('httpClient')private httpClient: HttpClient) {
    }
  }







interface Article {
  author: string;
  title: string;
  description: string;
  date: string;
  sourceName: string;
  aritlceUrl: string;
  imageUrl: string;
}
interface News {
  country: string;
  category: string;
  articles: Array<Article>;
}
