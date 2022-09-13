let num1 = [10,20,30,40,50,60];
document.write("<br/>")
document.write(num1);
document.write("<br/> using classical for loop");
for(let i=2;i<num1.length;i++){
    document.write("<br/> "+num1[i]);
}
document.write("<br/> using of loop");
for(let obj of num1){
    document.write("<br/>"+obj);
}
document.write("<br/> for in loop");
for(let i in num1){
    document.write("<br/>Index "+i+" Value "+num1[i])
}
document.write("<br> using for each with callback")
num1.forEach(display)               // passing the function name 
// display value using forEach with normal function 
function display(n){
    document.write("<br/> "+n)
}
// forEach with expression style function 
num1.forEach(function(n){
    document.write("<br/>"+n)
})
// forEach with arrow style function 
num1.forEach(n=>document.write("<br/>"+n));





