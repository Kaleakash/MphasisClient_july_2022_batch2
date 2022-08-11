<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Trainer Details</h2>
<form action="TrainerController" method="post">
<label>TId</label>
<input type="number" name="tid"><br/>
<label>TName</label>
<input type="text" name="tname"><br/>
<label>Tech</label>
<input type="text" name="tech"><br/>
<input type="submit" value="Store Trainer">
<input type="reset" value="reset">
</form>
<br/>
<a href="Home.jsp">Main</a>
</body>
</html>