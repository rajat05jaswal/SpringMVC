<%-- 
    Document   : quizPage2
    Created on : 17 Mar, 2019, 7:06:35 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Which statement is true regarding an object?</h2><hr>
        <form:form method="POST" commandName="quizapp">
            <form:radiobutton path="ans2" value="An object is what classes instantiated are from"/>An object is what classes instantiated are from<br>
            <form:radiobutton path="ans2" value="An object is an instance of a class"/>An object is an instance of a class<br>
            <form:radiobutton path="ans2" value="An object is a variable"/>An object is a variable<br>
            <form:radiobutton path="ans2" value="An object is a reference to an attribute"/>An object is a reference to an attribute<br>
            <form:errors path="ans2"/><br>
            <input type="submit" value="Previous" name="_target0" />
            <input type="submit" value="Cancel" name="_cancel" />
            <input type="submit" value="Next" name="_target2" />
        </form:form>
    </body>
</html>
