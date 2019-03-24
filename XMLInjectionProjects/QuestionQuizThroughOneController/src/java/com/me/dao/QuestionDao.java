/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.dao;

import com.me.pojo.Question;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rajat
 */
public class QuestionDao {
    private List<Question> quesList;

    public List<Question> getQuesList() {
        return quesList;
    }

    public void setQuesList(List<Question> quesList) {
        this.quesList = quesList;
    }
    public QuestionDao(){
        quesList=new ArrayList<>();
        populateQuestions();
    }
    public void populateQuestions(){
        
        String q1="The wrapping up of data and functions into a single unit is called";
        String q2="Which statement is true regarding an object?";
        String q3="In object-oriented programming, new classes can be defined by extending existing classes. This is an example of:";
        String q4="A package is a collection of?";
        String q5="Basic Java language functions are stored in which of the following java package?";
        
        String arr1[]={"Encapsulation","Abstraction","Data Hiding","Polymorphism"};
        String arr2[]={"An object is what classes instantiated are from","An object is an instance of a class","An object is a variable","An object is a reference to an attribute"};
        String arr3[]={"Encapsulation","Interface","Composition","Inheritance"};
        String arr4[]={"Classes","Interfaces","Editing tools","Classes and interfaces"};
        String arr5[]={"java.lang","java.io","java.net","java.util"};
        
        Question ques1=new Question(q1,arr1[0], Arrays.asList(arr1));
        Question ques2=new Question(q2,arr2[1], Arrays.asList(arr2));
        Question ques3=new Question(q3,arr3[3], Arrays.asList(arr3));
        Question ques4=new Question(q4,arr4[3], Arrays.asList(arr4));
        Question ques5=new Question(q5,arr5[0], Arrays.asList(arr5));
        
        quesList.add(ques1);
        quesList.add(ques2);
        quesList.add(ques3);
        quesList.add(ques4);
        quesList.add(ques5);
    }
}
