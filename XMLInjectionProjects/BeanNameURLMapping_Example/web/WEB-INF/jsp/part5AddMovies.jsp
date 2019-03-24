<%-- 
    Document   : Part7AddMovies
    Created on : Feb 12, 2019, 9:04:49 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add movies Part 5</title>
    </head>
    <body>
        <div>
            <h1>Please enter the below details</h1>
        </div>
        <div>
            <form method="POST" action="addMovies.htm">
                <table>
                    <tr>
                        <td>Movie Title :</td>
                        <td><input type="text" name="movie_title" required></td>
                    </tr>
                    <tr>
                        <td>Lead Actor :</td>
                        <td><input type="text" name="lead_actor"required></td>
                    </tr>
                    <tr>
                        <td>Lead Actress :</td>
                        <td><input type="text" name="lead_actress"required></td>
                    </tr>
                    <tr>
                        <td>Genre :</td>
                        <td><input type="text" name="genre"required></td>
                    </tr>
                    <tr>
                        <td>Year :  </td>
                        <td><input type="number" name="year" required></td>
                    </tr>
                </table>
                <div>
                    <input type="hidden" name="option" value="addMovies" />
                    <input type="submit" />
                </div>
            </form>
        </div>
        
    </body>
</html>
