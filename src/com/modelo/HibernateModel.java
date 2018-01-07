package com.modelo;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.modelo.entities.User;

public class HibernateModel {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			
			Configuration config = new Configuration();
			config.addAnnotatedClass(User.class);
			return config.
					buildSessionFactory(new StandardServiceRegistryBuilder
							().build());
			
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("ERROR TO CREATE FACTORY");
		}		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
