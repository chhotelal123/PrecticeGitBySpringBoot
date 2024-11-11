<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>This is help</h2>


 
 
 


 <h1>name ${name} </h1>
 <hr>
 
 <h1>Marks
 ${mark} 
 
 </h1>
<hr>
<c:forEach var="item" items="${mark}">
<h1>${item}</h1>


</c:forEach>

</body>
</html>