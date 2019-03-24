<%-- 
    Document   : index
    Created on : Feb 22, 2019, 8:12:56 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="csv" uri="WEB-INF/CSVTLD.tld" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/styles.css">
        <title>Assignment 4 Part4</title>
    </head>
    <body>
        <h1>Below Data is rendered from a custom tag</h1>
        <csv:CSVCustomTag fileName="salesOrder" />
    </body>
</html>
