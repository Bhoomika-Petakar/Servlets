<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Print square cube</title>
</head>
<body>
<%!
int square(int x){
	return x*x;
}

int cube(int x){
	return x*x*x;
}

%>
<h2 style="color: red"> SQUARE :<%= square(Integer.parseInt(request.getParameter("n")))  %> </h2>
<h2 style="color: blue">CUBE :<%= cube(Integer.parseInt(request.getParameter("n")))  %> </h2>

</body>
</html>