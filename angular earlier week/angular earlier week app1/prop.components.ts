import { Component } from '@angular/core';


@Component({
    selector:'prop',
    template: `
    
    <h1>{{message}}</h1>
    <p>{{message1}}</p>
    <button (click)="generate()">Get Random Number</button><br/>
    <p *ngIf="randomNumber">Your lucky number is {{randomNumber}}</p>
    `
})

export class PropComponent {
    message:string="Just trying!";
    message1:string="Get a Random Number";
    randomNumber: number; 


    generate(){
        this.randomNumber = Math.floor(Math.random()*100);
    }

}