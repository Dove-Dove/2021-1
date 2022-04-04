<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Insert title here</title>
</head>
<body>
<form action="tojoin.jsp" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="passward" name="pass"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>
				<input type="text" name="email">@
				</td>
				<td>
					<select name="intro">
		                    <option value="gmail.com" selected>gmail.com</option>
		                    <option value="naver.com">naver.com</option>
		                    <option value= "기타">기타</option>
		    	</select>
				</td>
			</tr>
		
			<tr>
				<td>즐겨 하는 게임</td>
				<td>
				     <input type="checkbox" name = "game" value="RPG" >RPG
		         <input type="checkbox" name = "game" value="FPS" >FPS
		         <input type="checkbox" name = "game" value="레이싱" >레이싱
		         <input type="checkbox" name = "game" value="스포츠" >스포츠
		         <input type="checkbox" name = "game" value="인디" >인디
		         <input type="checkbox" name = "game" value="기타" >기타
				</td>
			</tr>
		</table>
		 <input type="submit" value="가입">
	</form>
</body>
</html>