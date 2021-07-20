<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기</title>
<link rel="stylesheet" href="style/findid.css">
</head>
<body>
    <c:choose>
        <c:when test="${user == null}">
            <c:choose>
                <c:when test="${foundId == null}">
                    <div id="logo" class="title">
                        <a href="index.jsp">로고</a>
                    </div>
                    <div id="wrap">
                        <div id="title" class="title">아이디 찾기</div>
                        <form name="findIdForm" method="post"
                            action="findId.me">
                            <div class="input-area">
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
                        <div id="title" class="title">아이디 찾기</div>
                        <c:choose>
                            <c:when test="${foundId == ''}">
                                <div class="input-area">검색 결과가 없습니다.</div>
                            </c:when>
                            <c:otherwise>
                                <div class="input-area">
                                    검색된 아이디는 <b>${foundId}</b> 입니다.
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