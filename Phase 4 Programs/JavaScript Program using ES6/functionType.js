// // normal function 
//     display1();         // we call this function before declaration 
// function display1() {
//     document.write("<br/>Normal function declaration")
// }
//     display1();
// // expression style function with name 
// let display3 = function display2() {
//     document.write("<br/>Expression style function with name")
// }
// //display2();
// display3();

// //display4();         // we can't call this function before declaration 

// // expression style function without name 
// let display4 = function() {
//     document.write("<br/> Expression style function without name");
// }

// display4();

// // arrow function 
// let display5 = ()=> document.write("<br/> Simple Arrow function");
// display5();


// // passing parameter with expression style function 
// let addNumber1 = function(a,b){
//     var sum = a+b;
//     return sum;
// }
// document.write("<br/> Addition of two number using expression style "+addNumber1(10,20));
// // passing parameter with arrow style function 
// let addNumber2 = (a,b)=>a+b;
// document.write("<br/>Addition of two number using arrow function "+addNumber2(10,20));
// // find largest of two number using expression style 
// let findLargest1= function(a,b){
//     if(a>b){
//         return "a is largest"
//     }else {
//         return "b is largest"
//     }
// }
// document.write("<br/> find largest of two number using expression style "+findLargest1(10,20));
// // find largest of two number using arrow style 
// let findLargest2= (a,b)=>{
//     if(a>b){
//         return "a is largest"
//     }else {
//         return "b is largest"
//     }
// }
// document.write("<br/> find largest of two number using arrow style "+findLargest2(10,20));

// function greeting(fname,callback){
//         return "Welcome "+callback(fname);
// }


// let maleInfo = function(fname){
//     return "Mr "+fname;
// }

// let femaleInfo = (fname)=>"Miss "+fname;

// document.write("<br/> "+greeting("Raj",maleInfo));
// document.write("<br/> "+greeting("Seeta",femaleInfo));
// document.write("<br/>"+greeting("Ajay",function(fname){
//     return "Mr "+fname;
// }));
// document.write("<br/>"+greeting("Reeta",(fname)=>"Miss "+fname));

(function(){
    document.write("IIFE function")
})();

document.write("<br/>");

(function(a,b){
    document.write(a+b)
})(10,20);



