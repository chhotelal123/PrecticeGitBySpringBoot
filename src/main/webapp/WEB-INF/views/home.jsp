<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is home page</h1>
<%String name=(String)request.getAttribute("name");
%>
<h1>User name is <%= name%></h1>
<a href="about"> click her</a>
</body>
</html>