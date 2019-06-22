import { Component } from '@angular/core';


@Component({
    selector: 'login',
    templateUrl:  `./login.component.html`


})


export class LoginComponent{
    username: string;
    password: string;
    message: string;
    a:number;
    b:number;
    c:number;
    

    authenticate(){
        if(this.username == 'SDG' && this.password == '123')
            this.message = 'Valid User';
        else
            this.message = 'Invalid user id or password. Please try again ';
    }

    calculate(){

        this.c=this.a+this.b;

    }

}