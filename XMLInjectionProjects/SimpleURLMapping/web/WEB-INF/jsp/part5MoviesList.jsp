<%-- 
    Document   : Part7MoviesList
    Created on : Feb 13, 2019, 12:21:40 AM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/styles.css">
    </head>
    <body>
        <h1>List of Movies</h1>
        <h3>You searched for ${requestScope.keyword}</h3>
        <c:forEach items="${requestScope.movies}" var="item">
            <table>
                <tr>
                    <td><strong>Movie title<strong></td>
                    <td>${item.getTitle()}</td>
                </tr>
                <tr>
                    <td><strong>Movie Actor<strong></td>
                    <td>${item.getActor()}</td>
                </tr>
                <tr>
                    <td><strong>Movie Actress<strong></td>
                    <td>${item.getActress()}</td>
                </tr>
                <tr>
                    <td><strong>Movie Genre<strong></td>
                    <td>${item.getGenre()}</td>
                </tr>
                <tr>
                    <td><strong>Movie Year<strong></td>
                    <td>${item.getYear()}</td>
                </tr>
            </table>
        </c:forEach>
        
        <a href='movies.htm'>Click here to go back to the main Page</a>
    </body>
</html>
