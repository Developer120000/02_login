<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
	1. http://www.servlets.com 에서 라이브러리 다운로드하자.
		왼쪽에 COS File Upload Library 맨 하단에 cos-22.05.zip 다운
	2. 다운로드한 cos.jar 라이브러리를 WEB-INF 안에 lib 폴더에 넣어준다.
	3. 업로드 시 반드시 <form method="post" enctype="multipart/form-data"> 설정해야 한다.
	
	주의사항) 이클립스로 실행해서 업로드하면 실제 파일 위치는 가상 톰캣에 저장된다.
			  실제 프로젝트에서는 원하는 위치에 저장할 수 있다.
 --%>
 
 	<form action="/02_login/FileUpController" method="post" enctype="multipart/form-data">
 		<p>올린사람 : <input type="text" name="name"></p>
 		<p>첨부파일 : <input type="file" name="f_name"></p>
 		<input type="submit" value="업로드">
 	</form>
</body>
</html>