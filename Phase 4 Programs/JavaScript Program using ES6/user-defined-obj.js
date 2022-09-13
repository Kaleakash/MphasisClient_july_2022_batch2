// literal style object creation. 
let emp = '{"id":101,"name":"ramesh","age":24}';          // it is string consider 
let emp1 = {id:100,name:"Ravi",age:21};
document.write("<br/> Object creation in literal style")

document.write("<br/> Id is "+emp1.id);
document.write("<br/> name is "+emp1.name);
document.write("<br/> Age is "+emp1.age);
// we have to convert js object/json obj to string 
let empString = JSON.stringify(emp1);
document.write("<br/> Object property ")
document.write("<br/> Id is "+empString.id);
document.write("<br/> name is "+empString.name);
document.write("<br/> Age is "+empString.age);
// we have to convert string to json 
    let empJSON = JSON.parse(emp);
document.write("<br/> Object property ")

document.write("<br/> Id is "+empJSON.id);
document.write("<br/> name is "+empJSON.name);
document.write("<br/> Age is "+empJSON.age);
// converting json to string 
let empStr = JSON.stringify(empJSON);
document.write("<br/> Object property ")
document.write("<br/> Id is "+empStr.id);
document.write("<br/> name is "+empStr.name);
document.write("<br/> Age is "+empStr.age);
