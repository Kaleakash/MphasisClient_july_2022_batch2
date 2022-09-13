var empInfo;
function addData(){
    var idValue = document.getElementById("id").value
    var nameValule = document.getElementById("name").value;
    var obj = sessionStorage.getItem("obj");
    let emp = {id:idValue,name:nameValule};
    if(obj==null){
        empInfo = new Array();
        empInfo.push(emp);
        sessionStorage.setItem("obj",JSON.stringify(empInfo));
    }else {
        obj = JSON.parse(obj);
        obj.push(emp);
        sessionStorage.setItem("obj",JSON.stringify(obj));
    }
    // var name = "Raj Deep";
    // sessionStorage.setItem("obj1",name);        
    // localStorage.setItem("obj2",name);
    // //alert("Data added...");
    document.getElementById("id").value=""
    document.getElementById("name").value=""
    document.getElementById("out").innerHTML="Data Added.."
}