package com.student.boot.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class HibernateConfiguration {

	@Value("${db.driver}")
	private String DB_DRIVER;
	
	@Value("${db.password}")
	private String DB_PASSWORD;
	
	@Value("${db.url}")
	private String DB_URL;
	
	@Value("${db.username}")
	private String DB_USERNAME;
	
	@Value("${hibernate.dialect}")
	private String HIBERNATE_DIALECT;
	
	@Value("${hibernate.show_sql}")
	private String HIBERNATE_SHOW_SQL;
	
	@Value("${hibernate.hbm2ddl.auto}")
	private String HIBERNATE_HBM2DDL_AUTO; 
	
	@Value("${entitymanager.packegesToScan}")
	private String ENTITYMANAGER_PACKEGES_TO_SCAN;
	
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sessionFactory =new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(ENTITYMANAGER_PACKEGES_TO_SCAN);
		
		Properties HibernateProperties =new Properties();
		HibernateProperties.put("hibernate.dilect", HIBERNATE_DIALECT);
		HibernateProperties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
		HibernateProperties.put("hibernate.hbm2ddl.auto", HIBERNATE_HBM2DDL_AUTO);
		
		sessionFactory.setHibernateProperties(HibernateProperties);
		return sessionFactory;
	}
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource datasource =new DriverManagerDataSource();
		datasource.setDriverClassName(DB_DRIVER);
		datasource.setUrl(DB_URL);
		datasource.setUsername(DB_USERNAME);
		datasource.setPassword(DB_PASSWORD);
		return datasource;
	}
	
	@Bean
	public HibernateTransactionManager transationManager()
	{
		
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory().getObject());
		return txManager;
	}
	
}
