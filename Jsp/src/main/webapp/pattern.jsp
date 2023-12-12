<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>Square Pattern</title>
</head>
<body>


	<%
	
	int n=Integer.parseInt(request.getParameter("n"));
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			out.println("*");
		}
		out.println("<br/>");
	}
	
	

	%>
</body>
</html>