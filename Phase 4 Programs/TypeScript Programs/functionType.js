// any type consider 
// so here number of parameter must be match 
// by default any return type
function add(a, b) {
    console.log(a + " " + b);
}
add(100, 200);
add("A", "B");
//add(1);     // error 
//add();          // error 
// number of parameter and type of paramter must be match 
function addNumber(a, b) {
    console.log(a + b);
}
addNumber(1, 2);
addNumber(10.20, 20.20);
//addNumber("A","B");
// no return type. 
function info() {
    // coding 
    //return 100;
}
// string return type 
function sayHello() {
    return "Welcome";
}
// number return type 
function getnumber() {
    return 100;
}
// any return type we can return anything or no return. 
function display() {
    //return 100;
    //return "Welcome"
    return true;
}
// //optional parameter 
// // to declare optional parameter we have to use ?
// // operation optional declaration must be right to left.
// // declare all variable must be optional or 1 or more than one but 
// // indeclaration we can't leave any normal variable. default value for those optional 
// // variable is undefined. 
// function empInfo(id?:number,name?:string,age?:number):void {
//         console.log(id+" "+name+" "+age);
// }
// empInfo(1,"Ravi",21);
// empInfo(2,"Ramesh");        
// empInfo(3);
// empInfo();
//default intialization  
// to declare default initialization parameter we have to use default value 
// operation default initialization declaration must be right to left.
// declare all variable must be default initialization or 1 or more than one but 
// indeclaration we can't leave any normal variable. if we not pass value the value default consider.  
// variable is undefined. 
function empInfo(id, name, age) {
    if (id === void 0) { id = 0; }
    if (name === void 0) { name = "Unkonwn"; }
    if (age === void 0) { age = 18; }
    console.log(id + " " + name + " " + age);
}
empInfo(1, "Ravi", 21);
empInfo(2, "Ramesh");
empInfo(3);
empInfo();
