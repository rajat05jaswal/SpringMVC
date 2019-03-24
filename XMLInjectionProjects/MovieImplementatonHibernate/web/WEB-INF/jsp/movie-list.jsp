<%-- 
    Document   : movie-list
    Created on : Mar 9, 2019, 6:20:02 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Following movie is displayed </h1>
        <c:forEach items="${requestScope.MOVIES}" var="item">
            <table>
                <tr>
                    <td><strong>Movie ID<strong></td>
                    <td>${item.id}</td>
                </tr>
                <tr>
                    <td><strong>Movie title<strong></td>
                    <td>${item.title}</td>
                </tr>
                <tr>
                    <td><strong>Movie Actor<strong></td>
                    <td>${item.actor}</td>
                </tr>
                <tr>
                    <td><strong>Movie Actress<strong></td>
                    <td>${item.actress}</td>
                </tr>
                <tr>
                    <td><strong>Movie Genre<strong></td>
                    <td>${item.genre}</td>
                </tr>
                <tr>
                    <td><strong>Movie Year<strong></td>
                    <td>${item.year}</td>
                </tr>
            </table>
        </c:forEach>
    </body>
</html>
