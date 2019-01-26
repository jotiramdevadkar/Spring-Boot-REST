package com.spring.boot.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {


	  @Bean
	    public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource());
		    sessionFactory.setPackagesToScan("com");
		    
		    Properties hibernateProperties = new Properties();
		    hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		    hibernateProperties.put("hibernate.show_sql", true);
		    hibernateProperties.put("hibernate.hbm2ddl.auto", "update");
		    
		    sessionFactory.setHibernateProperties(hibernateProperties);
	        return sessionFactory;
	     }
		
	   
	    @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		    dataSource.setUrl("jdbc:mysql://localhost:3306/hibernate_db");
		    dataSource.setUsername("root");
		    dataSource.setPassword("root");
	        return dataSource;
	    }
	    
	    
		@Bean
	    public HibernateTransactionManager transactionManager() {
	       HibernateTransactionManager txManager = new HibernateTransactionManager();
	       txManager.setSessionFactory(sessionFactory().getObject());
	       return txManager;
	    }
	  
	  
	  
}
