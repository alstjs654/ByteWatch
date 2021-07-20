<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
<link rel="stylesheet" href="style/deleteAccount.css">
</head>
<body>
<c:choose>
    <c:when test="${user == null}">
    <script type="text/javascript">
    alert("로그인 하십시오");
    location.href = "login.jsp";
    </script>
    </c:when>
    <c:otherwise>
    <button onclick="deleteAccount()">탈퇴</button>
    <script type="text/javascript" src="script/deleteAccount.js"></script>
    </c:otherwise>
</c:choose>
</body>
</html>