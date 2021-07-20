<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>닉네임 중복확인</title>
</head>
<body>
    <div id="wrap">
        <c:choose>
            <c:when test="${nicknameUnique != '0'}">
                <script type="text/javascript">
                window.close();
                opener.alert("사용 가능합니다.");
                opener.document.getElementById("nicknameChecked").value = "true";
                </script>
            </c:when>
            <c:otherwise>
                <script type="text/javascript">
                window.close();
                opener.alert("이미 존재하는 닉네임입니다.");
                opener.document.getElementById("nicknameChecked").value = "false";
                </script>
            </c:otherwise>
        </c:choose>
    </div>
</body>
</html>
