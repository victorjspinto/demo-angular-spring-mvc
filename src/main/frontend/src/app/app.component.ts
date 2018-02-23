import { Component, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  public title:String = "app";
  public greeting:String;

  constructor(private http:HttpClient) {
    this.http.get('/greetings')
      .subscribe((data:{greeting:String}) => this.greeting = data.greeting);
  }

}
