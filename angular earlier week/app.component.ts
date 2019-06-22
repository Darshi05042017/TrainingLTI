import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <!--The content below is only a placeholder and can be replaced.-->
    <div style="text-align:center">
      <h1>
        Welcome to {{title}}!
      </h1>
     <a [routerLink]="['/login']">Login</a> <br /> <br />
     <a [routerLink]="['/register']">Register</a> <br /> <br />
     <a [routerLink]="['/products']">Products For Sale</a>
     <br /><br />
     <router-outlet></router-outlet>
    </div> 
  `,
  styles: []
})
export class AppComponent {
  title = 'My Webpage';
}
