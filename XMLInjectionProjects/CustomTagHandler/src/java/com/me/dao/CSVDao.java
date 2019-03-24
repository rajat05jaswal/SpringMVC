/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Rajat
 */
public class CSVDao {
    public List<List<String>> getResultData(String filename){
        ResultSet results;
        List<List<String>> list=new ArrayList<>();
        try {
            try {
                Class.forName("org.relique.jdbc.csv.CsvDriver");
                Connection conn = DriverManager.getConnection("jdbc:relique:csv:C:\\Users\\Rajat\\Documents\\NetBeansProjects\\Homework2\\web\\");
                Statement stmt = conn.createStatement();
                results = stmt.executeQuery("SELECT * from "+filename);

                ResultSetMetaData rsmd = results.getMetaData();
                int columnsNumber = rsmd.getColumnCount();
                while(results.next()){
                    List<String> columnData=new ArrayList<>();
                    for (int i = 1; i <= columnsNumber; i++) {
                        String columnValue = results.getString(i);
                        columnData.add(columnValue);
                    }
                    list.add(columnData);
                }
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
