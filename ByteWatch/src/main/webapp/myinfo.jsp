<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 정보</title>
<link rel="stylesheet" href="style/myinfo.css">
</head>
<body>
<c:choose>
    <c:when test="${user==null}">
        <script type="text/javascript">
        alert("로그인 하십시오");
        location.href = "login.jsp";
        </script>
    </c:when>
    <c:otherwise>
        <div id="wrap">
    <div id="leftListArea" class="left-list-area">
        <div class="logo"><a href="index.me">로고</a></div>
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
                    <div class="display">${user.nickname}</div>
                    <div class="modify-area"><a class="edit-link" href="editNickname.jsp">닉네임 수정</a></div>
                </div>
            </div>
            <div class="contents">
                <div class="name">이메일</div>
                <div class="info">
                    <div class="display">${user.email}</div>
                    <div class="modify-area"><a class="edit-link" href="editEmail.jsp">이메일 수정</a></div>
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