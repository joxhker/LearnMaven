package com.modelo;

import java.util.Date;

import org.hibernate.Session;

import com.modelo.entities.User;

public class Initial {
	private static Session session;
	public static void main(String[] args) {

		session = new HibernateModel().getSessionFactory().openSession();
		insertUser();
		session.close();
		

	}
	private static void insertUser() {
		session.getTransaction().begin();
		
		User us = new User();
		us.setBirthDate(new Date());
		us.setCity("Guatemala");
		us.setCreatedBy("Joshuar");
		us.setFistName("Joshuar");
		us.setLastName("Najera");
		us.setCreatedDate(new Date());
		us.setEmailAddress("joxha@gmail.com");
		us.setLastUpdatedDate(new Date());
		us.setLastUpdateBy("aa");
		
		session.save(us);
		session.getTransaction().commit();
	}

}
