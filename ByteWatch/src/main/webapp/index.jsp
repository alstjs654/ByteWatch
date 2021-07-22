<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>메인 페이지</title>
<link rel="stylesheet" href="style/index.css">
</head>
<c:if test="${dramaList == null}">
<script type="text/javascript">
location.href = "index.me";
</script>
</c:if>
<body>
    <div id="wrap">
        <jsp:include page="header.jsp" />
        <div id="container">
            <div class="content1">영화 목록</div>
            <div class="content2">
                <c:forEach var="list" items="${dramaList}" end="4">
                    <div class="drama-list"
                        style="background-image: url('drama/img/${list.image}'); height: 250px; width: 200px; display:inline-block;">
                        <a>${list.drama_name}</a>
                    </div>
                </c:forEach>
            </div>
        </div>
        <div id="footer"></div>
    </div>
</body>
</html>