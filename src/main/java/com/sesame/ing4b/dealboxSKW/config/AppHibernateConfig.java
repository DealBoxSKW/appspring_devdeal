package com.sesame.ing4b.dealboxSKW.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jca.support.LocalConnectionFactoryBean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sesame.ing4b.dealboxSKW.entities.Adresse;
import com.sesame.ing4b.dealboxSKW.entities.Contact;
import com.sesame.ing4b.dealboxSKW.entities.Contrat;
import com.sesame.ing4b.dealboxSKW.entities.Deal;
import com.sesame.ing4b.dealboxSKW.entities.Domaine;
import com.sesame.ing4b.dealboxSKW.entities.Partenaire;
import com.sesame.ing4b.dealboxSKW.entities.Service;

import static org.hibernate.cfg.Environment.*;

@Configuration
@PropertySource("classpath:jdbchibernate.properties")
@EnableTransactionManagement
@ComponentScans(value = {  @ComponentScan("com.sesame.ing4b.dealboxSKW.dao")})
public class AppHibernateConfig {

	@Autowired
	  private Environment env;
	
	@Bean
	public LocalSessionFactoryBean geSessionFactoryBean() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
	    
	    Properties props = new Properties();
	    
	    // Setting JDBC properties
	    props.put(DRIVER, env.getProperty("mysql.driver"));
	    props.put(URL, env.getProperty("mysql.jdbcUrl"));
	    props.put(USER, env.getProperty("mysql.username"));
	    props.put(PASS, env.getProperty("mysql.password"));

	    // Setting Hibernate properties
	    props.put(SHOW_SQL, env.getProperty("hibernate.show_sql"));
	    props.put(HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl.auto"));

	    // Setting C3P0 properties
	    props.put(C3P0_MIN_SIZE, env.getProperty("hibernate.c3p0.min_size"));
	    props.put(C3P0_MAX_SIZE, env.getProperty("hibernate.c3p0.max_size"));
	    props.put(C3P0_ACQUIRE_INCREMENT, env.getProperty("hibernate.c3p0.acquire_increment"));
	    props.put(C3P0_TIMEOUT, env.getProperty("hibernate.c3p0.timeout"));
	    props.put(C3P0_MAX_STATEMENTS, env.getProperty("hibernate.c3p0.max_statements"));

	    factoryBean.setHibernateProperties(props);
	    factoryBean.setAnnotatedClasses(Adresse.class,Contrat.class,Contact.class,Deal.class,Domaine.class,Partenaire.class,Service.class);
	    
	    return factoryBean;
	}
	
	 @Bean
	  public HibernateTransactionManager getTransactionManager() {
	    HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	    transactionManager.setSessionFactory(geSessionFactoryBean().getObject());
	    return transactionManager;
	  }
}
