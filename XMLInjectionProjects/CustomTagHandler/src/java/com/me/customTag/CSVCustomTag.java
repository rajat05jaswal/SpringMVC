/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.customTag;

import com.me.dao.CSVDao;
import java.util.List;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Rajat
 */
public class CSVCustomTag extends SimpleTagSupport {

    private String fileName;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            
            List<List<String>> list=new CSVDao().getResultData(this.fileName);
            out.println("<h1> Hello Tag </h1>");
            out.println("<table>");
            for(List<String> row: list){
                out.println("<tr>");
                for(String column : row){
                    out.println("<td>"+column+"</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }
             
        } catch (java.io.IOException ex) {
            throw new JspException("Error in CSVCustomTag tag", ex);
        }
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
}
