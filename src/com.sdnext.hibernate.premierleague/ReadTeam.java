package com.sdnext.hibernate.premierleague;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sdnext.hibernate.premierleague.dto.PremierLeague;
import com.sdnext.hibernate.premierleague.utility.HibernateUtil;

public class ReadTeam {

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
  Query query = session.createQuery("from PremierLeague");
  List students = query.list();
  for(PremierLeague team : teams)
  {
System.out.println("Position Number: "+team.getPosNumber()+", Club Name: "+team.getTeamName()+", Scoreline: "+team.getScoreline());
  }
  session.getTransaction().commit();
  sessionFactory.close();
 }
}