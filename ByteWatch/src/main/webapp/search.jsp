<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script>
    window.onload = async function () {
        var json
        var queryString = ;
        var apiKey = "a3c86039155edf82ed435e2be619b8a3"
        var url = "https://api.themoviedb.org/3/search/movie?api_key=" + apiKey + "&language=ko-KR&page=1&include_adult=false&query="
        url += queryString
        var response = await fetch(url)
        if(response.ok) {
            json = await response.json()
        }
        var results = json['results']
        var size = results.length
        for(var i = 0; i < size; i++) {
            document.write("<img src='")
            document.write("https://image.tmdb.org/t/p/w500")
            document.write(results[i].poster_path)
            document.write("'>")
        }
    }
</script>