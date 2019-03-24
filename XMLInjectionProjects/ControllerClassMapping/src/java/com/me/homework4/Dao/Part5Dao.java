/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.homework4.Dao;

import com.me.homework4.pojo.Movie;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author Rajat
 */
public class Part5Dao extends Dao{

    public List<Movie> retreiveMovies(String search, String keyword) {
        Connection connection = null;
        try {
            connection = new Dao().getConnection();
            QueryRunner queryRunner = new QueryRunner();
            String query="select * from movies where "+search+" LIKE '%"+keyword+"%'";
            ResultSetHandler<List<Movie>> h = new BeanListHandler<Movie>(Movie.class);
            List<Movie> m = queryRunner.query(connection, query, h);
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                DbUtils.close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public int addMovies(Movie m) {
        Connection connection = null;
        int result = 0;
        try {
            connection = new Dao().getConnection();
            QueryRunner queryRunner = new QueryRunner();
            String query="insert into movies values (?,?,?,?,?)";
            result = queryRunner.update(connection, query, m.getTitle(), m.getActor() , m.getActress(), m.getGenre(), m.getYear());
            //System.out.println("result of insert"+result);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }finally {
            try {
                DbUtils.close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
