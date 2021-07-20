<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 변경</title>
<link rel="stylesheet" href="style/changePw.css">
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
            <div id="logo" class="logo"><a class="logo" href="index.jsp">로고</a></div>
        <div id="wrap">
            <div id="title" class="title">회원가입</div>
            <div id="container">
                <form name="changePwForm" method="post" action="changePw.me" onsubmit="return checkChangePwForm()">
                    <div class="items">
                        <div class="label"><label for="newPw">새 비밀번호</label></div>
                        <div class="input">
                            <input id="newPw" name="newPw" type="password" minlength="8" maxlength="20"
                                   placeholder="영문, 숫자, 기호 사용 가능 (8~20자)" required>
                        </div>
                    </div>
                    <div class="items">
                        <div class="label"><label for="pwCheck">비밀번호 확인</label></div>
                        <div class="input">
                            <input id="pwCheck" name="pwCheck" type="password" minlength="8" maxlength="20"
                                   placeholder="비밀번호와 똑같이 입력하세요." onchange="isEqual()" required>
                            <div id="pwCheckWarning" class="warning"></div>
                        </div>
                    </div>
                    <div class="button-area">
                        <button type="submit" class="submit-btn">변경</button>
                    </div>
                </form>
            </div>
        </div>
        </c:otherwise>
    </c:choose>
    <script type="text/javascript" src="script/changePw.js"></script>
</body>
</html>