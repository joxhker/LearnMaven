package com.modelo;

import org.hibernate.Session;

public class Initial {

	public static void main(String[] args) {

		Session session = new HibernateModel().getSessionFactory().openSession();
		session.beginTransaction();
		
		

	}

}
