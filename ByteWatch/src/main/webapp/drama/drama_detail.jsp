<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<link rel='stylesheet' type='text/css' href='http://localhost:8080/ByteWatch/drama/drama_detail.css'>

<div id='drama_box'>
  <div id='drama_up'>
    <div class='drama_top_child drama_top_left'>
       <img src='img/${drama.genre }/${drama.image[0] }' width="500" height="500">
    </div>
 <div class='drama_top_child drama_top_left'>
 <form name='platf' method='post'>
  <p>${dimage.drama_name }</p>
  <p>
     <button type='button' onclick='platform()'>${dimage.drama_name}/${dimage.platform[i] }</button>
  </p>
  <p>
  출연배우 : ${dimage.actor }
  </p>
  <p>
  줄거리 : ${dimage.detail }
  </p>
  <p>
  시즌 : ${dimage.season }
  </p>
  <p>
  회차 : ${dimage.episode }
  </p>
  <p>
  예고편 : ${dimage.trailer }
  </p>
  <p>
     <button type='button' onclick='drama_wish()'><a href=''>찜</a></button>
     <button type='button' onclick='drama_wc()'><a href=''>시청목록</a></button>
  </p>
  <input type='hidden' name='drama_num' value='${dimage.drama_num }'>
  </form>
 </div>
</div>
<div id='similar_drama'>
<p>추천 드라마</p>
 <div class='similar_dm'>
   <img class="drama_img" src='drama/img/${dimage.genre[i] }/${dimage.image }' width="300" height="300">
 </div>
</div>


</div>