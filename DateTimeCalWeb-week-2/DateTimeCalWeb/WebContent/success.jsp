<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.sapient.siri.DateTimeCalc.NaturalLangPhrases" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
NaturalLangPhrases testguru=(NaturalLangPhrases)request.getAttribute("gurubean");
out.print("Welcome, "+testguru.getQuery());
%>
</body>
</html>