<%-- 
    Document   : quizPage3
    Created on : 17 Mar, 2019, 7:10:34 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ques 4</title>
    </head>
    <body>
        <h2>A package is a collection of?</h2><hr>
        <form:form method="POST" commandName="quizapp">
            <form:radiobutton path="ans4" value="Classes"/>Classes<br>
            <form:radiobutton path="ans4" value="Interfaces"/>Interfaces<br>
            <form:radiobutton path="ans4" value="Editing tools"/>Editing tools<br>
            <form:radiobutton path="ans4" value="Classes and interfaces"/>Classes and interfaces<br>
            <form:errors path="ans4"/><br>
            <input type="submit" value="Previous" name="_target2" />
            <input type="submit" value="Finish" name="_finish" />
            <input type="submit" value="Cancel" name="_cancel" />
        </form:form>
    </body>
</html>
