<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.reflect.Array"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String stdName; %>
<%
Object obj = session.getAttribute("obj");
List<String> listOfStd;
if(obj==null){
	listOfStd = new ArrayList<String>();
	stdName = request.getParameter("stdName");
	listOfStd.add(stdName);
	session.setAttribute("obj", listOfStd);
}else {
	stdName = request.getParameter("stdName");
	listOfStd = (List<String>)session.getAttribute("obj");
	listOfStd.add(stdName);
	for(String s:listOfStd){
		out.println("Name is "+s+"<br/>");
	}
}
%>
<%@include file="stdNames.jsp" %>
</body>
</html>