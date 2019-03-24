 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.controller;

import com.me.dao.MovieDao;
import com.me.pojo.Movie;
import com.me.validator.MovieValidator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author Rajat
 */
public class AddMoviesController extends SimpleFormController {
    
    public AddMoviesController() {
        setCommandClass(Movie.class);
        setCommandName("myMovie");
        setSuccessView("addMovie-success");
        setFormView("add-movie");
        setValidator(new MovieValidator());
    }
    
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        
        Movie m=(Movie) command;
        MovieDao mDao= (MovieDao) getApplicationContext().getBean("movieDao");
        int res=mDao.addMovie(m);
        return new ModelAndView(getSuccessView());
        //Do something...
//        return null;
    }
     
}
