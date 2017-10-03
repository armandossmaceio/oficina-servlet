<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bem vindo ao sistema simplificado</title>
</head>
<body>
<%
String email = (String) request.getAttribute("email");
String nome = (String) request.getAttribute("nome");
out.println("Olá " + nome + "!");
out.println("seu e-mail: " + email + "foi validado");
%>
</body>
</html>