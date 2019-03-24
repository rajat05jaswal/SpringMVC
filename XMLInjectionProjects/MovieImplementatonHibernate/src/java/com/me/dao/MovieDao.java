/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.dao;

import com.me.pojo.Movie;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Rajat
 */
public class MovieDao {
    private SessionFactory sessionFactory;
    private static Session session;
    
    protected SessionFactory setUp() throws Exception {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();
        try {
            this.sessionFactory = configuration.buildSessionFactory(registry);
            
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
        
        return sessionFactory;
    }
    
    public Session getSession() throws Exception {
        if(session == null || !session.isOpen()) {
            session = setUp().openSession();
        }
        return session;
    }

    private void beginTransaction() throws Exception {
        getSession().beginTransaction();
    }

    private void commit() throws Exception {
        getSession().getTransaction().commit();;
    }

    private void close() throws Exception {
        getSession().close();
    }

    private void rollbackTransaction() throws Exception {
        getSession().getTransaction().rollback();
    }
    
    public int addMovie(Movie m) throws Exception{
        int result = 0;
        try {
            beginTransaction();
            getSession().save(m);
            commit();
            result = 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            rollbackTransaction();
        } finally {
            close();
        }
        return result;
    }
    
    public List<Movie> getMovies(long id) throws Exception{
        List<Movie> movieList=new ArrayList<Movie>();
        try {
            beginTransaction();
            Query q = getSession().createQuery("from Movie where id= :id");
            q.setLong("id", id);
            movieList = q.list();
            commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            rollbackTransaction();
        } finally {
            close();
        }
        return movieList;
    }
}
