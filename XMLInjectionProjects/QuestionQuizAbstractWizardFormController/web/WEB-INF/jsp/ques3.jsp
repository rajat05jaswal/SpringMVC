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
        <title>Ques 3</title>
    </head>
    <body>
       <h2>In object-oriented programming, new classes can be defined by extending existing classes. This is an example of: ?</h2><hr>
        <form:form method="POST" commandName="quizapp">
            <form:radiobutton path="ans3" value="Encapsulation"/>Encapsulation<br>
            <form:radiobutton path="ans3" value="Interface"/>Interface<br>
            <form:radiobutton path="ans3" value="Composition"/>Composition<br>
            <form:radiobutton path="ans3" value="Inheritance"/>Inheritance<br>
            <form:errors path="ans3"/><br>
            <input type="submit" value="Previous" name="_target1" />
            <input type="submit" value="Cancel" name="_cancel" />
            <input type="submit" value="Next" name="_target3" />
        </form:form>
    </body>
</html>
