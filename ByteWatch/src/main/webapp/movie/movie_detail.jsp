<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet' type='text/css' href='<%=request.getContextPath() %>/style/movie.css'>
<title>movie--</title>
</head>
<body>
	<div id ='bigbox'>
		<div id='top_box'>
		<!-- 검색/로그인 -->
			<h2>로그인/</h2>
		</div>			
		<div style=>
		</div>
		<div id='movie'>
		<!-- 영화상세 -->
			<div id="movie_img">
				<img id='detail_img' src="${movie.image }">
			</div>
			<div id="movie_detail">
				<table>
					<tr><td>제목 : </td><td>${movie.movie_name }</td></tr>
					<tr><td>출연 : </td><td>${movie.actor }</td></tr>
					<tr><td>장르 :</td><td>${movie.genre }</td></tr>
					<tr><td>별점 :</td><td>★★★★★</td></tr>
					<tr>
						<td>시리즈:</td>
						<td>
							<select>
								<option>없음.</option>
							</select>
							<button>이동</button>
						</td>
					</tr>
					<tr><td>줄거리 :</td><td></td></tr>
				</table>		
			</div>
		</div>	
		<!-- 스트리밍안내  -->
		<div id='streaming'>
		<div id='in'>
			<button>예 고 편</button>
			<button>메이킹 영상</button>
			<div id='in_hi'>영상 넣는곳,</div>		
		</div>
			<div id='site_div'>
			<table  border='1'>
				<tr>
<c:forTokens var="ff" items="${ movie.platform}"  delims=",">
					<td class="">${ff }</td>
				
	</c:forTokens>		
				</tr>
			</table>
			<select id='site_list'>
					<option>시청목록추가하기.</option>
			</select>
			<button>등록</button>
			<br>
			<select id='site_list'>
					<option>찜하기</option>
			</select>
			<button>등록</button>
			</div>			
		</div>			
		<!-- 이와 유사한 추천영화  -->
		<div id='bottom_box'>
			<ul class='q1'><h2> 영화 추천 </h2>
<c:forEach var="glgl" items="${ movieAB}">
			<ul class='q2'>
				<li><a href="movie_detail.mv?num=${glgl.movie_num }"><img src="${glgl.image }" class="img_list"></a></li>
				<li></li>	
				<li>${glgl.genre} </li>	
			</ul>
</c:forEach>
			</ul>
		</div>
	
	</div>

</body>
</html>