/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.controller;

import com.me.dao.MovieDao;
import com.me.pojo.Movie;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author Rajat
 */
public class SearchMovieController extends SimpleFormController {
    
    public SearchMovieController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Movie.class);
        setCommandName("myMovieSearch");
        setSuccessView("movie-list");
        setFormView("search-movies");
        
    }
    
    
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        
        long id=(long) Long.parseLong(request.getParameter("id"));
        MovieDao dao=(MovieDao) getApplicationContext().getBean("movieDao");
        List<Movie> list=dao.getMovies(id);
        if(list.isEmpty()){
            errors.rejectValue("id", "error.id.notfound", "No movie Found");
            return new ModelAndView(getFormView());
        }
        return new ModelAndView(getSuccessView(),"MOVIES",list);
    }
}
