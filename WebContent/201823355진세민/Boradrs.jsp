<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%>
	제목: <%= request.getParameter("qw")%><br>
	내용: <%= request.getParameter("memo")%><br>
	올리는 장소:<%= request.getParameter("intro")%><br>
</body>
</html>