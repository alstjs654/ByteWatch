<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>닉네임 수정</title>
<link rel="stylesheet" href="style/editNickname.css">
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
            <div id="logo" class="title">
                <a href="index.jsp">로고</a>
            </div>
            <div id="wrap">
                <div id="title" class="title">닉네임 수정</div>
                <form name="editNicknameForm" method="post"
                    action="editNickname.me" onsubmit="return checkEditNicknameForm()">
                    <div class="input-area">
                        <div class="input">
                            <div class="items">
                                <div class="label">현재 닉네임</div>
                                <input type="text" minlength="4"
                                    maxlength="20" name="oldNickname"
                                    value="${user.nickname}" readonly>
                            </div>
                        </div>
                        <div class="input">
                            <div class="items">
                                <div class="label">변경할 닉네임</div>
                                <div class="input">
                                    <input id="newNickname" name="newNickname"
                                        type="text" minlength="4"
                                        maxlength="16"
                                        placeholder="변경할 닉네임을 입력하십시오."
                                        required onchange="watch()">
                                </div>
                                <div class="btn-area">
                                    <button class="check-btn" type="button"
                                        onclick="checkNickname()">중복확인</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="submit-area">
                        <div class="submit">
                            <button type="submit" class="submit-btn">변경하기</button>
                        </div>
                    </div>
                    <input type="hidden" name="nicknameChecked"
                        id="nicknameChecked" value="false">
                </form>
            </div>
            <script type="text/javascript" src="script/editNickname.js"></script>
        </c:otherwise>
    </c:choose>
    
</body>
</html>