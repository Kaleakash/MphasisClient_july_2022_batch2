import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Child } from './child.component';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent,Child          // all component declaration. 
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]   // parent component details. 
})

export class AppModule { }
