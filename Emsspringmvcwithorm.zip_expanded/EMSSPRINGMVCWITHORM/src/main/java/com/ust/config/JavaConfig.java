package com.ust.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ust.model.Employee;


@Configuration
@ComponentScan(basePackages = "com.ust")
@EnableTransactionManagement
public class JavaConfig {
	@Bean
	public DriverManagerDataSource dsObj() {
		
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/ust");
		ds.setUsername("root");
		ds.setPassword("17ns1996");
		
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean lsbObj() {
		LocalSessionFactoryBean ls= new LocalSessionFactoryBean();
		ls.setDataSource(dsObj());
		ls.setHibernateProperties(props());
		ls.setAnnotatedClasses(Employee.class);
		
		return ls;
	}
public Properties props() {
		
		Properties p = new Properties();
		
		p.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.show_sql","true");
		p.setProperty("hibernate.format_sql","true");
		p.setProperty("hibernate.hbm2ddl.auto","update");
		return p;
		
	}
	
	@Bean
	public HibernateTemplate htobj(SessionFactory s) {
		HibernateTemplate ht = new HibernateTemplate();
		ht.setSessionFactory(s);
		
		return ht;
	}
	
	
	@Bean
	public HibernateTransactionManager tsobj(SessionFactory s) {
		
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(s);
		return htm;
	}
	
	
	
	
}
