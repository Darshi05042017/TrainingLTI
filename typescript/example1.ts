export class Person{
    name:string;
    age: number;

    constructor(name: string, age : number){

        this.name=name;
        this.age=age;

    }

    info(): string {
        return "Hello "+ this.name + " Your age is " + this.age ;
    }
}

