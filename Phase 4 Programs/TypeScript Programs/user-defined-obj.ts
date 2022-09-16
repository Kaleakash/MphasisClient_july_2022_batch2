// // literal style 
// let emp1 = {id:100,name:"Ravi",age:21};
// console.log(emp1.id)
// console.log(emp1.name)
// console.log(emp1.age);

// // function style : ES5 style 
// function Employee() {
//     this.eid = 101;                 // it is consider a instance variable 
//     this.ename = "Ramesh";
//     this.salary = 12000;

//     this.display = function() {         // it is consider a Employee object function 
//         console.log("id is "+this.eid);
//         console.log("name is "+this.ename);
//         console.log("salary is "+this.salary);
//     }
// }
// //Employee();     // it behave like a normal function 
// let emp2 = new Employee();
// emp2.display();

// function Customer() {
//     var a =10;          // normal variable consider 
//     let b = 20;         // normal variable consider 
//     this.c = 30;        // instance varaible consider 
//     let dis1 = function(){
//         console.log("dis1 function")            // normal function consider in expresion style 
//     }   
//     this.dis2 = function() {                // object behaviour consider 
//         console.log("dis2 function");
//     }
//     function dis3() {                       // normal function consider 
//         console.log("dis3 funtion")
//     }
// }

// var c1 = new Customer();
// console.log(c1.a);
// console.log(c1.b)
// console.log(c1.c);
// //c1.dis1();
// c1.dis2();
// //c1.dis3();

// object creation using class style
// typescript support access specifiers  
// class Employee {
//         private id:number=100;
//         private name:string = "Ravi";
//         private salary:number = 12000;          // instance variable consider
//         public display(): void {
//             console.log("id is "+this.id);  // inside a function if we want to access instance variable 
//             console.log("name is "+this.name);      // we have to use with this keyword. 
//             console.log("salary is "+this.salary);
//         } 
// }

// let emp1 = new Employee();
// let emp2 = new Employee();
// //console.log(emp1.id)
// //emp1.id=-100;
// emp1.display();
// emp2.display();

// constructor : to create a constructor in typescript we have to use constructor 
// keyword for function. 
// class Employee {
//     constructor() {
//         console.log("object created...")
//     }
//     display() : void {
//         console.log("display function");
//     }
// }
// let emp1 = new Employee();
// emp1.display();

// parameterized constructor
// typescript we can't write more than one constructor 
// it may be empty or parameter but only one  
// class Employee {
//     private id:number;
//     private name:string;
//     private age:number;
//     constructor(id:number=0,name:string="Unkown",age:number=18) {
//         this.id = id;
//         this.name = name;
//         this.age = age;
//     }
//     //constructor() {}
//     display() : void {
//         console.log("id is "+this.id);
//         console.log("name is "+this.name);
//         console.log("age is "+this.age);
//     }
// }
// let emp1 = new Employee(1,"Ravi",21);
// let emp2 = new Employee(2,"Ramesh");
// let emp3  = new Employee(3);
// let emp4 = new Employee();
// emp1.display();
// emp2.display();
// emp3.display();
// emp4.display();

// typescript short curt initliazation
// we can use private or public access specifiers with 
// constructor parameter variable to make the variable as 
// a instance variable. 
class Employee {
   
    constructor(private id:number=0,public name:string="Unkown",private age:number=18) {
      
    }
    //constructor() {}
    display() : void {
        console.log("id is "+this.id);
        console.log("name is "+this.name);
        console.log("age is "+this.age);
    }
}
let emp1 = new Employee(1,"Ravi",21);
let emp2 = new Employee(2,"Ramesh");
let emp3  = new Employee(3);
let emp4 = new Employee();
emp1.display();
emp2.display();
emp3.display();
emp4.display();


