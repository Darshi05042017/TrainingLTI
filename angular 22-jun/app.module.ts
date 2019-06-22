import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'

import { AppComponent } from './app.component';
import { PNRStatusComponent } from 'src/app/pnr-status.component';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { PNRStatusService } from 'src/app/pnr-status.service';

@NgModule({
  declarations: [
    AppComponent,
    PNRStatusComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule

  ],
  providers: [HttpClient,PNRStatusService],
  bootstrap: [AppComponent]
})
export class AppModule { }
