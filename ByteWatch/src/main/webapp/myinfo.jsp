<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 정보</title>
</head>
<body>
<c:choose>
    <c:when test="${user==null}">
        <c:redirect url="login.jsp"/>
    </c:when>
    <c:otherwise>
        <div id="wrap">
    <div id="leftListArea" class="left-list-area">
        <div class="logo"><a href="index.html">로고</a></div>
        <div class="list-area">
            <ul class="my-info-list">
                <li>
                    <div class="list-area"><a href="myinfo.jsp">내 프로필</a></div>
                </li>
                <li>
                    <div class="list-area"><a href="changePw.jsp">비밀번호 변경</a></div>
                </li>
                <li>
                    <div class="list-area"><a href="deleteAccount.jsp">회원 탈퇴</a></div>
                </li>
            </ul>
        </div>
    </div>
    <div id="contentArea">
        <div class="content-header">
            <span>내 프로필</span>
        </div>
        <div id="container">
            <div class="contents">
                <div class="name">닉네임</div>
                <div class="info">
                    <div class="display">닉네임 표시</div>
                    <div class="modify-area"><a class="edit-link" href="">닉네임 수정</a></div>
                </div>
            </div>
            <div class="contents">
                <div class="name">이메일</div>
                <div class="info">
                    <div class="display">이메일 표시</div>
                    <div class="modify-area"><a class="edit-link" href="">이메일 수정</a></div>
                </div>
            </div>
            <div class="contents">
                <div class="name"></div>
                <div class="info">
                    <div class="display"></div>
                    <div class="modify-area"></div>
                </div>
            </div>
            <div class="contents">
                <div class="name"></div>
                <div class="info">
                    <div class="display"></div>
                    <div class="modify-area"></div>
                </div>
            </div>
        </div>
    </div>
</div>
    </c:otherwise>
</c:choose>
</body>
</html>