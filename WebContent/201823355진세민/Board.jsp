<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
<form action="Boradrs.jsp">
	<table>
			<tr>
				<td>제목</td>
				 <td><input type="text"name="qw"></td>
			</tr>
			
			<tr>
			<td>게시글</td>
				<td>
                <textarea rows="4" name="memo"></textarea>
       </td>
			</tr>
		 <tr>
            <td>가입경로</td>
            <td>
                <select name="intro">
                    <option value="자유" selected>자유게시판</option>
                    <option value="자료">자료게시판</option>
                </select>
            </td>
        </tr>
	</table>
	<input type="submit" value="작성학기">
	</form>
</body>
</html>