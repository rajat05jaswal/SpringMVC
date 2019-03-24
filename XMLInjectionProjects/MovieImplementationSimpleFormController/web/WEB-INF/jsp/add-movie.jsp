<%-- 
    Document   : add-movie
    Created on : Mar 9, 2019, 5:14:23 PM
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
        <h1>Add Movie to Database</h1>
        <form:form commandName="myMovie">
            
            <table>
                <tr>
                    <td>Movie Title :</td>
                    <td><form:input type="text" path="title" /></td>
                    <td><font color="red"><form:errors path="title" /></font></td>
                </tr>
                <tr>
                    <td>Lead Actor :</td>
                    <td><form:input type="text" path="actor" /></td>
                    <td><font color="red"><form:errors path="actor" /></font></td>
                </tr>
                <tr>
                    <td>Lead Actress :</td>
                    <td><form:input type="text" path="actress" /></td>
                    <td><font color="red"><form:errors path="actress" /></font></td>
                </tr>
                <tr>
                    <td>Genre :</td>
                    <td><form:input type="text" path="genre" /></td>
                    <td><font color="red"><form:errors path="genre" /></font></td>
                </tr>
                <tr>
                    <td>Year :  </td>
                    <td><form:input type="number" path="year" /></td>
                    <td><font color="red"><form:errors path="year" /></font></td>
                </tr>
            </table>
            <input type="submit"  value="Add Movie"/>
        </form:form>
    </body>
</html>
