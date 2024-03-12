<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>내 정보</h2>
	<form action="/02_login/SessionController" method="post" autocomplete="off">
		<p> Name : ${svo.name } </p>	<!-- el 로 세션에 저장되어있는 정보 꺼내기 -->
		<p> Email : ${svo.email } </p>
		<p> Addr : ${svo.addr } </p>
		<p> Phone : ${svo.phone } </p>
		<input type="hidden" name="cmd" value="" >
		<input type="submit" value="수정하기" >
	</form>
</body>
</html>