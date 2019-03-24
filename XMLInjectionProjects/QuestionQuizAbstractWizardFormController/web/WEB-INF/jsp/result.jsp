<%-- 
    Document   : result
    Created on : 17 Mar, 2019, 7:12:48 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>
        <h2>The answers to your questions were</h2><br>
        <form:form method="POST" commandName="quizapp">
            <h2>${quizapp.ans1}<br></h2>
            <h2>${quizapp.ans2}<br></h2>
            <h2>${quizapp.ans3}<br></h2>
            <h2>${quizapp.ans4}<br></h2>
        </form:form>
        
    </body>
</html>
