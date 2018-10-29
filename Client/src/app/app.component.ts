import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Client';
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
