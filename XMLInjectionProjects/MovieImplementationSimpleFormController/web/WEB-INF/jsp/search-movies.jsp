<%-- 
    Document   : search-movies
    Created on : Mar 9, 2019, 6:05:10 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Search by Movie ID</h1>
        <form:form commandName="myMovieSearch">
            <form:errors path="*" />
            <hr>
            <input type="number" name="id" /> Search by ID <br>
            <hr>
            <input type="submit" value="Search Movies" />
        </form:form>
    </body>
</html>
