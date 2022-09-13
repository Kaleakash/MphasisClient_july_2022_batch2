// // creating array using literal style 
// let num1 = [];
// //creating array using new keyword 
// let num2 = new Array();
// // creating array using literal style with few values. 
// document.write("Size of the array "+num1.length)
// document.write("<br/>Size of the array "+num2.length)
// let num3 = [10,20,30,40];
// document.write("<br/>Size of the array "+num3.length)
// document.write("<br/> All elements are "+num3); 
// num3.push(100);
// num3.push(200);     // it will help to add the element at last 
// num3.unshift(1);
// num3.unshift(2);        // it will add the element at the begining 
// document.write("<br/> All elements are "+num3); // it display as a string sepated by , 
// num3.pop();     // remove elements from last 
// num3.shift();   // remove the element from begining 
// document.write("<br/> All elements are "+num3); // it display as a string sepated by , 
// document.write("<br/>")
// document.write(typeof(num2))
// let num4 = [10,20,30,40,50];
// //splice : using this method we can add, remove elements in between array 
// document.write("<br/> "+num4)
// document.write("<br> 0 position value "+num4[0]);
// document.write("<br> 1 position value "+num4[1]);
// //num4.splice(1,1);       // 1st parameter index position and 2nd number number of elements from that position 
// //num4.splice(1,2);       // 1st parameter index position and 2nd number number of elements from that position
// //num4.splice(1,1,200);       // 1st parameter index position and 2nd number number of elements from that position
//                             // 3rd parameter add 200 element 
// // add 200 in 1 index position                             
// //num4.splice(1,0,200);       // 1st parameter index position and 2nd number number of elements from that position
//                             // 3rd parameter add 200 element 
// //num4.splice(1,0,111,222,333);       // from 1 index position adding 3 element as 111,222,333
// num4.splice(1,2,111,222,333);
// document.write("<br/> "+num4);



