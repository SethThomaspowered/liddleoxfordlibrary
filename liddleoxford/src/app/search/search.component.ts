import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  book: string = "";
  info: any;
  constructor(private http: HttpClient) { }
  findBook(book: string){
    this.http
    .get(`https://www.googleapis.com/books/v1/volumes?q=${book}`)
    .subscribe((response) => {
      console.log(response);
      this.info = response;
    });
  }
  ngOnInit(): void {
  }

}
