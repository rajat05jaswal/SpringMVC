<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/Homework5Part4/css/main.css">
        <title>Homework 4 Part 4</title>
    </head>

    <body>
        <c:choose>
            <c:when test="${requestScope.QUESNO==6}">
                <h1>Your results are</h1>
                <div>
                    <table>
                        <th>Marked Answer </th>
                        <th>Correct Answer </th>
                        <c:forEach items="${sessionScope.Map}" var="result">
                            <tr>
                                <td>${result.value}</td>
                                <td>${result.key}</td>
                            </tr>
                        </c:forEach> 
                    </table>
                </div>
                
            </c:when>
            <c:otherwise>
                <form action="${requestScope.QUESNO+1}.htm" method="POST" >
                    <h1>Quiz</h1>
                    <h2>Question No ${requestScope.QUESNO}</h2>
                    <h3>${requestScope.QUES.question}</h3>
                    <ul>
                        <c:forEach items="${requestScope.QUES.options}" var="option">
                            <li><input type="radio" value="${option}" name="optionChosen"/>${option}</li>
                        </c:forEach>
                    </ul>
                    <input type="hidden" name="nextQuestion" value="${requestScope.QUESNO+1}" />
                    <input type="submit" value="Next"/>
                </form>
            </c:otherwise>
        </c:choose>
        
        
    </body>
</html>
