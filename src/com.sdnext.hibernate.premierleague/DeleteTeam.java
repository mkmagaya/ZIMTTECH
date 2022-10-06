package com.sdnext.hibernate.premierleague;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sdnext.hibernate.premierleague.dto.PremierLeague;
import com.sdnext.hibernate.premierleague.utility.HibernateUtil;

public class DeleteTeam {

 /**
  * @param args
  */
 public static void main(String[] args) 
 {
  //Create session factory object
  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  //getting session object from session factory
  Session session = sessionFactory.openSession();
  //getting transaction object from session object
  session.beginTransaction();
  PremierLeague team = (PremierLeague)session.load(PremierLeague.class, 4);
  session.delete(team);
  System.out.println("Deleted Successfully");
  session.getTransaction().commit();
     sessionFactory.close();
 }
}