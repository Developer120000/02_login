<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입</h2>
	<form action="/02_login/SessionController" method="post" autocomplete="off">
		<p>**ID : <input type="text" name="id" placeholder="아이디를 입력하세요" required></p>
		<p>**PWD : <input type="password" name="pwd" placeholder="비밀번호를 입력하세요" required></p> <!-- form 태그 네임은 디비 속성이름 따라가야됨 -->
		<p>**Name : <input type="text" name="name" placeholder="이름을 입력하세요" required></p>
		<p>**Email : <input type="text" name="email" placeholder="이메일을 입력하세요" required></p>
		<p>Addr : <input type="text" name="addr" placeholder="주소를 입력하세요"></p>
		<p>Phone : <input type="text" name="phone" placeholder="전화번호를 입력하세요"></p>
		<input type="hidden" name="cmd" value="s_join_ok">
		<input type="submit" value="회원가입">
		<input type="reset" value="취소">
	</form>
</body>
</html>