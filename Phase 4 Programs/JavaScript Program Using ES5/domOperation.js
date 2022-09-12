//alert("External JS")
function addData() {
   // alert("Event fired...")
   var name = document.getElementById("n1").value
   var age  = document.getElementById("n2").value;
   var pTag = document.createElement("p");      // tag reference is ready 
   var pTagContent = document.createTextNode("name is "+name+" age is "+age);      // text reference is ready 

   pTag.appendChild(pTagContent);               // added content inside a tag 


   document.getElementById("out").appendChild(pTag);        // added p tag inside div tag
   document.getElementById("n1").value=""
   document.getElementById("n2").value="" 
}