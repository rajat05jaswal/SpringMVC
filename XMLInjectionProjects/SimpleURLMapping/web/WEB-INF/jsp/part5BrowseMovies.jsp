<%-- 
    Document   : Part7BrowseMovies
    Created on : Feb 12, 2019, 9:05:46 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Searching Movies</h1> 
        </div>
        <div class="searching">
            <form action="search.htm" method="post">
                <div><p></p><input type="text" name="keyword" required/></div>
                <input type="radio" name="search" value="title" checked="true"> Search by Title <br>
                <input type="radio" name="search" value="actor" /> Search by Actor <br>
                <input type="radio" name="search" value="actress" /> Search by Actress <br>
                <input type="hidden" name="option" value="search_movie" />
                <input type="submit" value="Search Movies" />
            </form>
        </div>
        
    </body>
</html>
