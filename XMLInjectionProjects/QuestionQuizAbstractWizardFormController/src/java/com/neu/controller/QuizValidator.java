/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.neu.pojo.Answers;
import org.springframework.validation.ValidationUtils;
/**
 *
 * @author Suraj PC
 */
public class QuizValidator implements Validator{

    @Override
    public boolean supports(Class<?> type) {
        return Answers.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {}
    
    public void validatePage1(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "ans1", "required.ans1","Selecting an option is mandatory");
    }
    
    public void validatePage2(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "ans2", "required.ans2","Selecting an option is mandatory");
    }
    
    public void validatePage3(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "ans3", "required.ans3","Selecting an option is mandatory");
    }
    
    public void validatePage4(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "ans4", "required.ans4","Selecting an option is mandatory");
    }
}
