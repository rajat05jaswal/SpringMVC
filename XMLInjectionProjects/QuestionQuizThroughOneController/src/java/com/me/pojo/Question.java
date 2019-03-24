/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rajat
 */
public class Question {
    private String question;
    private String answer;
    private List<String> options;

    public Question(String question, String answer, List<String> options){
        this.question=question;
        this.options=options;
        this.answer=answer;
    }
    
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public List<String> getOptions() {
        return options;
    }
    
}
