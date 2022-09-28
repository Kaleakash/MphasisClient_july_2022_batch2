function validateLogin() {
    //alert("Hello");
    var email = document.getElementById("n1").value;
    let password = document.getElementById("n2").value;
    if(email.length==0){
        alert("Plz enter email id")
        return false;
    }else if(password.length==0){
        alert("Plz enter the password")
        return false;
    }else if(email=="raj@gmail.com" && password=="123"){
        alert("successfully login")
        return true;
    }else {
        alert("failure try once again")
        return false;
    }
    
}