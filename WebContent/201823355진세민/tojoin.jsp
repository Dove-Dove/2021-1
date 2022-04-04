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
		String[] game =request.getParameterValues("game");
	%>
	
	아이디: <%= request.getParameter("id")%><br>
	비밀번호: <%= request.getParameter("pass")%><br>
	가입경로:<%= request.getParameter("email")%> <%= request.getParameter("intro")%><br>
	게임:<% for(int i= 0; i<game.length;i++){
		out.println(game[i]+" ");} %><br>
		
</body>
</html>