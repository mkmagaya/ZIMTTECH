package com.sdnext.hibernate.premierleague;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sdnext.hibernate.premierleague.dto.PremierLeague;
import com.sdnext.hibernate.premierleague.utility.HibernateUtil;

public class CreateTeam {

 /**
  * @param args
  */
 public static void main(String[] args) 
 {
  //Create club entity object
  PremierLeague team = new Team();
  team.setStudentName("Dinesh Rajput");
  team.setRollNumber(01);
  team.setCourse("MCA");
  
  //Create session factory object
  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  //getting session object from session factory
  Session session = sessionFactory.openSession();
  //getting transaction object from session object
  session.beginTransaction();
  
  session.save(student);
  System.out.println("Inserted Successfully");
  session.getTransaction().commit();
  session.close();
  sessionFactory.close();
 }
}