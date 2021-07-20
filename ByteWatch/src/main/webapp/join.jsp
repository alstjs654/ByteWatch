<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
    <link rel="stylesheet" href="style/join.css">
</head>
<body>
<c:choose>
    <c:when test="${user==null}">
        <div id="logo" class="logo"><a class="logo" href="index.jsp">로고</a></div>
        <div id="wrap">
            <div id="title" class="title">회원가입</div>
            <div id="container">
                <form name="joinForm" method="post" action="join.me" onsubmit="return checkJoinForm()">
                    <div class="items">
                        <div class="label"><label for="id">아이디</label></div>
                        <div class="input">
                            <input id="id" name="id" type="text" minlength="4" maxlength="20"
                                   placeholder="영문 소문자, 숫자만 사용 가능 (4~20자)" required onchange="watchId()">
                        </div>
                        <button class="check-btn" onclick="checkId()">중복확인</button>
                    </div>
                    <div class="items">
                        <div class="label"><label for="pw">비밀번호</label></div>
                        <div class="input">
                            <input id="pw" name="pw" type="password" minlength="8" maxlength="20"
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
                    <div class="items">
                        <div class="label">닉네임</div>
                        <div class="input">
                            <input id="nickname" name="nickname" type="text" minlength="4" maxlength="16"
                                   placeholder="특수문자, 기호 사용 불가(4~16byte)" required onchange="watchNickname()">
                        </div>
                        <button class="check-btn" onclick="checkNickname()">중복확인</button>
                    </div>
                    <div class="items">
                        <div class="label"><label for="email">이메일</label></div>
                        <div class="input">
                            <input id="email" name="email" type="email" maxlength="45"
                                   placeholder="아이디/비밀번호 찾기에 이용됩니다.">
                        </div>
                    </div>
                    <div class="items">
                        <div class="label">나이</div>
                        <div class="input">
                            <select name="age" id="age" required>
                                <option value="none" selected>선택</option>
                                <option value="10">10대</option>
                                <option value="20">20대</option>
                                <option value="30">30대</option>
                                <option value="40">40대</option>
                                <option value="50">50대</option>
                                <option value="60">60대</option>
                                <option value="70">70대</option>
                                <option value="80">80대</option>
                                <option value="90">90대</option>
                            </select>
                        </div>
                    </div>
                    <input type="hidden" name="idChecked" id="idChecked" value="false">
                    <input type="hidden" name="nicknameChecked" id="nicknameChecked" value="false">

                    <div class="button-area">
                        <button type="submit" class="submit-btn">가입</button>
                    </div>
                </form>
            </div>
        </div>
        <script src="script/join.js"></script>
    </c:when>
    <c:otherwise>
        이미 로그인 중입니다.
    </c:otherwise>
</c:choose>
</body>
</html>