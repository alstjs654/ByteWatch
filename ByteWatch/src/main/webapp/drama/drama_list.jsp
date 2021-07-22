<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>드라마 탐색</title>
</head>
<link rel='stylesheet' type='text/css' href='http://localhost:8080/ByteWatch/drama/drama_list.css'>
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
	width:100px;}

</style>

<body bgcolor="#252525">

<div id ='box'>


<div class='top'>
<ul>
   <li><a href="../join.html">회원가입</a></li>
   <li><a href="../login.html">로그인</a></li>
</ul>
<ul id='home'>
  <li><a href="../index.html">홈</a></li>
  <li><a href="../movie.html">영화 홈</a></li>
  <li><a href="drama_index.drama">드라마 홈</a></li>
</ul>

</div>

<div id='drama_list'>
<ul>
<li><a href="#">모든 장르</a>
   <ul> 
       <li><a href="#">액션/스릴러</a></li> 
       <li><a href="#">로맨스</a></li> 
       <li><a href="#">시트콤</a></li> 
       <li><a href="#">전쟁/아포칼립스</a></li>
       <li><a href="#">공포/호러</a></li>
       <li><a href="#">판타지/SF</a></li>
       <li><a href="#">추리/범죄</a></li>
       <li><a href="#">시대물</a></li>
       <li><a href="#">의학</a></li>
       <li><a href="#">기타</a></li> 
  </ul>
</li>
<li><a href="#">국가</a>
   <ul>
       <li><a href="#">한국</a></li>
       <li><a href="#">미국</a></li>
       <li><a href="#">영국</a></li>
       <li><a href="#">아시아</a></li>
       <li><a href="#">기타</a></li>
   </ul>
  </li>
<li><a href="watching_list.drama">시청 목록</a></li>
    <li><input type='text' name='search_name'><button>검색</button></li>
</div>
</ul>


</div>
</div>

</body>
</html>