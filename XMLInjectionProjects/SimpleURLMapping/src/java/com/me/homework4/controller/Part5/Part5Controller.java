/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.homework4.controller.Part5;

import com.me.homework4.Dao.Part5Dao;
import com.me.homework4.pojo.Movie;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Rajat
 */
public class Part5Controller extends AbstractController {
    
    public Part5Controller() {
    }
    
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Part5Dao dao=new Part5Dao();
        String value=request.getParameter("movie-option");
        if(value.equals("Browse Movies")){
            return new ModelAndView("part5BrowseMovies");
        }else{
            return new ModelAndView("part5AddMovies");
        }
    }
    
}
