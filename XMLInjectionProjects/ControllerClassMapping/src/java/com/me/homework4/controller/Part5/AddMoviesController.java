/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.homework4.controller.Part5;

import com.me.homework4.Dao.Part5Dao;
import com.me.homework4.pojo.Movie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Rajat
 */
public class AddMoviesController extends AbstractController {
    
    public AddMoviesController() {
    }
    
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Part5Dao dao=new Part5Dao();
        String title=request.getParameter("movie_title");

        String actor=request.getParameter("lead_actor");
        String actress=request.getParameter("lead_actress");
        String genre=request.getParameter("genre");
        int year =Integer.parseInt(request.getParameter("year"));
        Movie m=new Movie(title,actor, actress, genre, year);

        int res=dao.addMovies(m);
        if(res>0){
            request.setAttribute("noOfMovies", res);
            return new ModelAndView("part5Success");
        }else{
            return new ModelAndView("part5Failure","message", "You entered incorrect values kindly enter again");
        }
    }
    
}
