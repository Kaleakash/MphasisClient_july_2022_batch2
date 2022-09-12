//alert("External JS")
function addData() {
   // alert("Event fired...")
   var name = document.getElementById("n1").value
   var age  = document.getElementById("n2").value;
   var pTag = document.createElement("p");      // tag reference is ready 
   var pTagContent = document.createTextNode("name is "+name+" age is "+age);      // text reference is ready 

   pTag.appendChild(pTagContent);               // added content inside a tag 
   if(age>30){
    pTag.setAttribute("class","myClass1");
   }else {
    pTag.setAttribute("class","myClass2"); 
   }

   var aTag = document.createElement("a");      // tag reference is ready
   var aTagContent = document.createTextNode("remove");
   aTag.appendChild(aTagContent);
   aTag.setAttribute("href","#");               // added attribute as href with value #
   aTag.setAttribute("onClick","deleteData("+ pTag +")"); // added attribute as onClick with value as functionname
   pTag.appendChild(aTag);

   document.getElementById("out").appendChild(pTag);        // added p tag inside div tag
   document.getElementById("n1").value=""
   document.getElementById("n2").value="" 
}
function deleteData(obj){
    console.log(obj)
}
