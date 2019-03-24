/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.validator;

import com.me.pojo.Movie;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Rajat
 */
public class MovieValidator implements Validator{

    @Override
    public boolean supports(Class<?> type) {
        return Movie.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Movie m=(Movie) o;
        if(m.getActor()==""){
            errors.rejectValue("actor", "error.actor.required","Kindly enter Actor");
        }
        if(m.getActress()==""){
            errors.rejectValue("actress","error.actress.required", "Kindly enter Actress");
        }
        if(m.getGenre()==""){
            errors.rejectValue("genre","error.genre.required", "Kindly enter Genre");
        }
        if(m.getTitle()==""){
            errors.rejectValue("title","error.title.required", "Kindly enter Title");
        }
        if(m.getYear()==0){
            errors.rejectValue("year", "error.year.required","Kindly enter Year");
        }
        
        if(m.getYear()<1500){
            errors.rejectValue("year", "error.year.valid","Kindly enter valid Year");
        }
    }
    
}
