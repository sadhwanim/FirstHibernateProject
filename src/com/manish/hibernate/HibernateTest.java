package com.manish.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manish.dto.UserDetails;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		UserDetails userDetails = new UserDetails();
		userDetails.setUserId(1);
		userDetails.setUserName("First User");
		userDetails.setAddress("First Users address");
		userDetails.setDescription("Description");
		userDetails.setJoinedDate(new Date());
		
		//building session factory
		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();	
		session.close();
		session = sessionFactory.openSession();
		session.beginTransaction();
		userDetails = (UserDetails) session.get(UserDetails.class,1);
		System.out.println(userDetails.getUserName());
	}

}
