<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이메일 수정</title>
<link rel="stylesheet" href="style/editEmail.css">
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
                <div id="title" class="title">이메일 수정</div>
                <form name="editEmailForm" method="post"
                    action="editEmail.me">
                    <div class="input-area">
                        <div class="input">
                            <div class="items">
                                <div class="label">현재 이메일</div>
                                <input type="text" name="oldEmail"
                                    value="${user.email}" readonly>
                            </div>
                        </div>
                        <div class="input">
                            <div class="items">
                                <div class="label">변경할 이메일</div>
                                <div class="input">
                                    <input id="newEmail" name="newEmail"
                                        type="email"
                                        maxlength="50"
                                        placeholder="변경할 이메일을 입력하십시오."
                                        required>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="submit-area">
                        <div class="submit">
                            <button type="submit" class="submit-btn">변경하기</button>
                        </div>
                    </div>
                </form>
            </div>
        </c:otherwise>
    </c:choose>
</body>
</html>