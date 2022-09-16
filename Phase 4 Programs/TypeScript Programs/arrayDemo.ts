let num1:number[]=[];   // memory creation in literal style 
let num2:Array<number>=[];// memory creation in litral style with generics 
let num3:Array<number>=new Array(); // memroy creation with new keyworod with generics 
num1.push(10);
num1.push(20);
num1.push(30);
//num1.push("Ravi");
let names:string[]=new Array();
let info:any[]=new Array();
info.push(100);
info.push("Ravi");
info.push(true);
// this interface is use to make the type of object. 
interface Employee{
    id:number;
    name:string;
    age:number;
}
let emp1:Employee = {id:100,name:"Ravi",age:21};
let emp2:Employee = {id:101,name:"Ramesh",age:25};
let emp3:Employee = {id:102,name:"Rajesh",age:28};
let emp4:Employee = {id:103,name:"Lokesh",age:36};
let emp5:Employee = {id:104,name:"Mahes",age:34};

let employees:Array<Employee>=new Array();          // array object. 
employees.push(emp1);
employees.push(emp2);
employees.push(emp3);
employees.push(emp4);
employees.push(emp5);

employees.forEach(e=>console.log(e.id+" "+e.name+" "+e.age));

let res1 = employees.find(e=>e.id==101);            // searching the record from array if present it return that object 
let res2 = employees.find(e=>e.id==1000);           // else return undefined 

let res3 = employees.findIndex(e=>e.id==103);       // searching the record from array if present it return that record index position  
let res4 = employees.findIndex(e=>e.id==1000);       // else return -1 

console.log(res3)
console.log(res4);





