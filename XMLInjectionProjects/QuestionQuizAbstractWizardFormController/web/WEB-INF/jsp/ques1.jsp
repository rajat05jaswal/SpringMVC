<%-- 
    Document   : quizPage1
    Created on : 17 Mar, 2019, 6:45:31 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ques 1</title>
    </head>
    <body>
        <h2>The wrapping up of data and functions into a single unit is called?</h2><hr>
        <form:form method="POST" commandName="quizapp">
            <form:radiobutton path="ans1" value="Encapsulation"/>Encapsulation<br>
            <form:radiobutton path="ans1" value="Abstraction"/>Abstraction<br>
            <form:radiobutton path="ans1" value="Data Hiding"/>Data Hiding<br>
            <form:radiobutton path="ans1" value="Polymorphism"/>Polymorphism<br>
            <br>
            <form:errors path="ans1"/><br>
            <input type="submit" value="Next" name="_target1" />
            <input type="submit" value="Cancel" name="_cancel" />
        </form:form>
    </body>
</html>
