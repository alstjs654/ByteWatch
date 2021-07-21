<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>드라마 홈</title>

<link rel='stylesheet' type='text/css' href='http://localhost:8080/ByteWatch/drama/drama_index.css'>

</head>

<style>
    a { text-decoration: none; color: #D5D5D5; }
    a:visited { text-decoration: none; }
    a:hover { text-decoration: none; }
    a:focus { text-decoration: none; }
    a:hover, a:active { text-decoration: none; }
        .top{ height:100px; }	
    .top ul li{
    
	text-decoration:none;
	list-style-type:none;
	float:right;
	width:80px;}
</style>

<body bgcolor= "#252525">

<div id ='box'>


<div class='top'>

<ul>
   <li><a href="../join.html">회원가입</a></li>
   <li><a href="../login.html">로그인</a></li>
</ul>
<ul id='home'>
   <li><a href="index.html">홈</a></li>
   <li><a href="movie.html">영화 홈</a></li>
   <li><a href="drama_index.jsp">드라마 홈</a></li>
</ul>

</div>



<div id = 'menu'>
<ul>
<li><a href='drama_index.drama'>드라마 홈</a></li>
<li><a href='drama_list.jsp'>드라마 탐색</a></li>
<li><input type='text' name='search_name'><button>검색</button></li>
</ul>
</div>

<h2>지금 HOT한 드라마</h2>

  <div class="row">
 <%--   forEach  var="i" begin="0" end="" step="1"  --%>
  	<c:forEach  var="i" items="${dimage }">
	    <div class="column">
	     <a href="drama_detail.drama?num=${i.drama_num }"> <img class="demo cursor" src='drama/img/${i.image}' width="500" height="500" style="width:100%" onclick="currentSlide(1)" >
	    	</a>
	    </div>
    </c:forEach>
    
  </div>
</div>



</div>

</body>
</html>