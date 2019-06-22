import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HelloComponent } from 'src/app/hello.component';
import { PropComponent } from 'src/app/prop.components';
import { LoginComponent } from 'src/app/login.component';
import { FormsModule } from '@angular/forms';
import { ListProductComponent } from 'src/app/list-product.component';

@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    PropComponent,
    LoginComponent,
    ListProductComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
