<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>드라마 홈</title>

<link rel='stylesheet' type='text/css' href='drama_index.css'>

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

<div class="container">
  <div class="mySlides">
    <div class="numbertext">1 / 6</div>
    <img src="http://placehold.it/500x100" style="width:100%">
  </div>

  <div class="mySlides">
    <div class="numbertext">2 / 6</div>
    <img src="http://placehold.it/500x100" style="width:100%">
  </div>

  <div class="mySlides">
    <div class="numbertext">3 / 6</div>
    <img src="http://placehold.it/500x100" style="width:100%">
  </div>
    
  <div class="mySlides">
    <div class="numbertext">4 / 6</div>
    <img src="http://placehold.it/500x100" style="width:100%">
  </div>

  <div class="mySlides">
    <div class="numbertext">5 / 6</div>
    <img src="http://placehold.it/500x100" style="width:100%">
  </div>
    
  <div class="mySlides">
    <div class="numbertext">6 / 6</div>
    <img src="http://placehold.it/500x100" style="width:100%">
  </div>
    
  <a class="prev" onclick="plusSlides(-1)">❮</a>
  <a class="next" onclick="plusSlides(1)">❯</a>

  <div class="caption-container">
    <p id="caption"></p>
  </div>
<h2>지금 HOT한 드라마</h2>

  <div class="row">
    <div class="column">
      <img class="demo cursor" src='img/friends.jpg' width="500" height="500" style="width:100%" onclick="currentSlide(1)" >
    </div>
    <div class="column">
      <img class="demo cursor" src='img/bnana.jpg' width="500" height="500" style="width:100%" onclick="currentSlide(2)">
    </div>
    <div class="column">
      <img class="demo cursor" src='img/crazy.jpg' width="500" height="500" style="width:100%" onclick="currentSlide(3)">
    </div>
    <div class="column">
      <img class="demo cursor" src='img/sherlock.jpg' width="500" height="500" style="width:100%" onclick="currentSlide(4)">
    </div>
    <div class="column">
      <img class="demo cursor" src='img/peaky.jpg' width="500" height="500" style="width:100%" onclick="currentSlide(5)">
    </div>    
    <div class="column">
      <img class="demo cursor" src='img/sthings.jpg' width="500" height="500" style="width:100%" onclick="currentSlide(6)">
    </div>
  </div>
</div>



</div>

</body>
</html>