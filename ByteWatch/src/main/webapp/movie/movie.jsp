<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/style/movie.css">
<title>movie</title>
</head>
<body>
<div id ='bigbox'>
	<div id='top_box'>
	<!-- 검색/로그인 -->
		<h2>로그인/</h2>
	</div>
	
	<div class='list_box'><h2>새로 업데이트된</h2>
		<ul class='q1'>
	<c:forEach var="glgl" items="${ movie}">
			<ul class='q2'>
				<li><a href="movie_detail.mv?num=${glgl.movie_num }&genre=${glgl.genre}"><img src="${glgl.image }" class="img_list"></a></li>
				<li></li>	
				<li>${glgl.genre} </li>	
			</ul>
	</c:forEach>
		</ul>
	</div>


</div>

</body>
</html>