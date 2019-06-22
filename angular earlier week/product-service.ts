import { Injectable } from '@angular/core';
import { Product } from 'src/app/product';

/* 
classes in which we write code in angular
for communicating with the server are commonly
referred as Service classes.
*/

@Injectable()
export class ProductService{
    fetchListOfProducts(): Product[] {
        return[
        new Product(1,"Nokia 6600",5000,99,"picture.jpeg"),
        new Product(2,"Sony Xperia",15000,99,"picture.jpeg"),
        new Product(3,"Samsung note",25000,99,"picture.jpeg"),
        new Product(4,"Iphone x",55000,99,"picture.jpeg"),
        new Product(5,"MI 9",35000,99,"picture.jpeg")
        ];

    }

}