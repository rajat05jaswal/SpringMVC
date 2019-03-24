<%-- 
    Document   : Part4
    Created on : Feb 12, 2019, 12:22:52 AM
    Author     : Rajat
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Part 7</title>
    </head>
    <body>
        <div>
            <h1>Welcome to our Movie Store </h1>
            <p>Please make a selection below</p>
        </div>
        <form method="post" action="part5.htm">
            <select name="movie-option" id="movie-option">
                <option value="Browse Movies" selected>Browse Movies</option>
                <option value="Add New Movies to Database">Add New Movies to Database</option>
            </select>
            <input type="hidden" name="option" value="mainPage" />
            <input type="submit"  value="Send" />
        </form>
    </body>
</html>
