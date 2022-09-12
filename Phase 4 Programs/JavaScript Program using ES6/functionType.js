// normal function 
    display1();         // we call this function before declaration 
function display1() {
    document.write("<br/>Normal function declaration")
}
    display1();
// expression style function with name 
let display3 = function display2() {
    document.write("<br/>Expression style function with name")
}
//display2();
display3();

//display4();         // we can't call this function before declaration 

// expression style function without name 
let display4 = function() {
    document.write("<br/> Expression style function without name");
}

display4();