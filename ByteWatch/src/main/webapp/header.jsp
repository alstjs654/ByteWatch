<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="header">
    <div class="banner" title="홈페이지"><a class="logo" href="index.jsp">로고</a></div>
    <div class="search-area">
        <form name="searchForm" method="get" action="search.do">
            <input id="query" name="query" type="text" maxlength="255" placeholder="검색">
            <button class="search-btn" type="submit">검색</button>
        </form>
    </div>
    <div class="account-area">
        <c:choose>
            <c:when test="${user == null}">
                <div class="login">
                    <a href="login.jsp" class="login-btn">로그인</a>
                </div>
                <div class="join">
                    <a href="join.jsp" class="join-btn">회원가입</a>
                </div> 
            </c:when>
            <c:otherwise>
                <div class="user-info">
                    <a class="user-link" href="myinfo.jsp">${user.nickname} 님</a>
                </div>
                <div class="logout">
                    <a href="logout.me" class="logout-btn">로그아웃</a>
                </div>
            </c:otherwise>
        </c:choose>
        
    </div>
</div>