<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기</title>
<link rel="stylesheet" href="style/findpw.css">
</head>
<body>
    <c:choose>
        <c:when test="${user == null}">
            <c:choose>
                <c:when test="${foundPw == null}">
                    <div id="logo" class="title">
                        <a href="index.jsp">로고</a>
                    </div>
                    <div id="wrap">
                        <div id="title" class="title">비밀번호 찾기</div>
                        <form name="findPwForm" method="post"
                            action="findPw.me">
                            <div class="input-area">
                                <div class="input">
                                    <input name="id" id="id"
                                        type="text"
                                        placeholder="아이디를 입력하세요" minlength="4"
                                        maxlength="20">
                                </div>
                                <div class="input">
                                    <input name="email" id="email"
                                        type="email"
                                        placeholder="이메일을 입력하세요"
                                        maxlength="50">
                                </div>
                            </div>
                            <div class="submit-area">
                                <div class="submit">
                                    <button type="submit"
                                        class="submit-btn">찾기</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </c:when>
                <c:otherwise>
                    <div id="logo" class="title">
                        <a href="index.jsp">로고</a>
                    </div>
                    <div id="wrap">
                        <div id="title" class="title">비밀번호 찾기</div>
                        <c:choose>
                            <c:when test="${foundPw == ''}">
                                <div class="input-area">검색 결과가 없습니다.</div>
                            </c:when>
                            <c:otherwise>
                                <div class="input-area">
                                    비밀번호는 <b>${foundPw}</b> 입니다.
                                </div>
                                <div class="login">
                                    <a href="login.jsp" class="login-btn">로그인</a>
                                </div>
                            </c:otherwise>
                        </c:choose>
                    </div>
                </c:otherwise>
            </c:choose>
        </c:when>
        <c:otherwise>
            <h1>이미 로그인 중입니다.</h1>
        </c:otherwise>
    </c:choose>
</body>
</html>