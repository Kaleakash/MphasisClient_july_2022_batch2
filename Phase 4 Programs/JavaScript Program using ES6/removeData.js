function removeData() {
    sessionStorage.removeItem("obj1");
    localStorage.removeItem("obj2");
    //alert("Data removed...")
    document.getElementById("out").innerHTML="Data removed.."
}
