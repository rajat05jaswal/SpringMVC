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
public class SearchMoviesController extends AbstractController {
    
    public SearchMoviesController() {
    }
    
    protected ModelAndView handleRequestInternal( HttpServletRequest request, HttpServletResponse response) throws Exception {
        String search=request.getParameter("search");
        String keyword=request.getParameter("keyword");
        Part5Dao dao=new Part5Dao();
        List<Movie> list= dao.retreiveMovies(search, keyword);
        if(list.size()==0){
            return new ModelAndView("part5Failure","message","You searched for "+keyword+" and there are no "+search+" results !!");
        }
        request.setAttribute("movies", list);
        request.setAttribute("keyword", keyword);
        return new ModelAndView("part5MoviesList");
    }
    
}
