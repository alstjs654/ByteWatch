<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<link rel='stylesheet' type='text/css' href='http://localhost:8080/ByteWatch/drama/drama_detail.css'>


<body bgcolor= "#252525">

<div id='drama_box'>

  <div id='drama_up'>
    <div class='drama_top_child drama_top_left'>
       <img src='drama/img/${drama.image }' width="500" height="500">
    </div>
 <div class='drama_top_child drama_top_left'>
 <form name='platf' method='post'>
  <p>${drama.drama_name }</p>
  <p>
     <button type='button' onclick='platform()'>플랫폼 ${drama.platform }</button>
  </p>
  <p>
  출연배우 : ${drama.actor }
  </p>
  <p>
  줄거리 : ${drama.detail }
  </p>
  <p>
  시즌 : ${drama.season }
  </p>
  <p>
  회차 : ${drama.episode }
  </p>
  <p>
  예고편 : ${drama.trailer }
  </p>
  <p>
     <button type='button' onclick='drama_wish()'><a href=''>찜</a></button>
     <button type='button' onclick='drama_wc()'><a href=''>시청목록</a></button>
  </p>
  <input type='hidden' name='drama_num' value='${drama.drama_num }'>
  </form>
 </div>
</div>
<div id='similar_drama'>
<p>추천 드라마</p>
 <div class='similar_dm'>
   <img class="drama_img" src='drama/img/${drama.image }' width="300" height="300">
 </div>
</div>


</div>

<script>
function drama_wish() {
var fm=document.platf;
}
function drama_wc(){
var fm=document.platf;

}

</script>