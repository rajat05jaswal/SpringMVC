/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.controller;

import com.neu.pojo.Answers;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

/**
 *
 * @author Rajat
 */
public class QuizAppController extends AbstractWizardFormController{

    public QuizAppController() {
        setCommandName("quizapp");
        setCommandClass(Answers.class);
        setPages(new String[] {"ques1","ques2","ques3","ques4"});
    }

    
    @Override
    protected ModelAndView processFinish(HttpServletRequest hsr, HttpServletResponse hsr1, Object o, BindException be) throws Exception {
        Answers a = (Answers) o;
        return new ModelAndView("result","quizapp",a);
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        Answers a = new Answers();
        return a;
    }

    @Override
    protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        return new ModelAndView("welcome");
    }

    @Override
    protected void validatePage(Object command, Errors errors, int page) {
        QuizValidator qv = (QuizValidator) getValidator();
        
        switch(page){
            case 0: qv.validatePage1(command, errors); break;
            case 1: qv.validatePage2(command, errors); break;
            case 2: qv.validatePage3(command, errors); break;
            case 3: qv.validatePage4(command, errors); break;
        }
    }
   
    
    
}
