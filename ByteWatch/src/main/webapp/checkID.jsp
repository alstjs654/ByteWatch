<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>아이디 중복확인</title>
</head>
<body>
    <div id="wrap">
        <c:choose>
            <c:when test="${idUnique != '0'}">
                <script type="text/javascript">
                window.close();
                opener.alert("사용 가능합니다.");
                opener.document.getElementById("idChecked").value = "true";
                </script>
            </c:when>
            <c:otherwise>
                <script type="text/javascript">
                window.close();
                opener.alert("이미 존재하는 아이디입니다.");
                opener.document.getElementById("idChecked").value = "false";
                </script>
            </c:otherwise>
        </c:choose>
    </div>
</body>
</html>
