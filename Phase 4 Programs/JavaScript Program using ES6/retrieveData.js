function retrieveData(){
    // var obj1 = sessionStorage.getItem("obj1");
    // var obj2 = localStorage.getItem("obj2");
    // //alert("name from session storage "+obj1+" name from local storage "+obj2);
    // document.getElementById("out").innerHTML="name from session storage "+obj1+" name from local storage "+obj2

    var obj = sessionStorage.getItem("obj");
    if(obj==null){
        document.getElementById("out").innerHTML="Record not present"
    }else {
        let empData = JSON.parse(obj);
        for(let i =0;i<empData.length;i++){
            let pTag = document.createElement("p");
            let ptTagValue = document.createTextNode("Id is "+empData[i].id+" Name is "+empData[i].name);
            pTag.appendChild(ptTagValue);
            document.getElementById("result").appendChild(pTag);
        }

    }
    
  
    
}