/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.controller;

import com.me.dao.QuestionDao;
import com.me.pojo.Question;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Rajat
 */
public class QuestionController extends AbstractController {
    
    public QuestionController() {
    }
    
    
    protected ModelAndView handleRequestInternal( HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session =request.getSession();
        Map<String, String> map;
        QuestionDao qDao=(QuestionDao) getApplicationContext().getBean("questionDao");
        List<Question> listQuestions=qDao.getQuesList();
        if(session.getAttribute("Map")==null){
            map=new HashMap<>();
        }else{
            map=(Map<String, String>) session.getAttribute("Map");
        }
        
        int currentPage=1;
        if(request.getParameter("nextQuestion")!=null){
            currentPage=Integer.parseInt(request.getParameter("nextQuestion"));
        }
        request.setAttribute("QUESNO", currentPage);
        String optionChosen=request.getParameter("optionChosen");
        if(optionChosen!=null){
            map.put(listQuestions.get(currentPage-2).getAnswer(), optionChosen);
        }
        session.setAttribute("Map", map);
        if(currentPage==6){
            return new ModelAndView("quiz","listQuestions",listQuestions);
        }else{
            Question currQ=listQuestions.get(currentPage-1);
            return new ModelAndView("quiz", "QUES", currQ);
        }
        
    }
    
}
