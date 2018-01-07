package com.modelo;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.modelo.entities.User;

public class HibernateModel {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {

			Configuration config = new Configuration();
			
			// Classes
				config.addAnnotatedClass(User.class);
			
			// properties
				config.setProperty("connection.driver_class", "com.mysql.jdbc.Driver");
				config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/prueba");
				config.setProperty("hibernate.connection.username", "root");
				config.setProperty("hibernate.connection.password", "");
				config.setProperty("dialect", "org.hibernate.dialect.MySQL5Dialect");
				config.setProperty("show_sql", "true");
			//config.setProperty("hibernate.hbm2ddl.auto", "update");
			// config.setProperty(" hibernate.connection.pool_size", "10");
			
			

			// constructor
			return config.buildSessionFactory(new StandardServiceRegistryBuilder()
					.applySettings(config.getProperties()).build());

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("ERROR TO CREATE FACTORY");
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
