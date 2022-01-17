import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  book: string = "Harry Potter";
  info: any;
  title: string|null = "";
  description: string|null = "";
  image: string|null= "";
  googleId: string|null= "";
  constructor(private http: HttpClient) { }
  findBook(book: string){
    this.http
    .get(`https://www.googleapis.com/books/v1/volumes?q=${book}`)
    .subscribe((response) => {
      console.log(response);
      this.info = response;
      this.title = this.info.items[0].volumeInfo.title;
      this.description = this.info.items[0].volumeInfo.description;
      this.image = this.info.items[0].volumeInfo.imageLinks.smallThumbnail;
      this.googleId = this.info.items[0].id;
    });
  }
  ngOnInit(): void {
  }

}
