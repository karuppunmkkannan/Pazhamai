package com.config;

import static org.hibernate.cfg.AvailableSettings.C3P0_ACQUIRE_INCREMENT;
import static org.hibernate.cfg.AvailableSettings.C3P0_MAX_SIZE;
import static org.hibernate.cfg.AvailableSettings.C3P0_MAX_STATEMENTS;
import static org.hibernate.cfg.AvailableSettings.C3P0_MIN_SIZE;
import static org.hibernate.cfg.AvailableSettings.C3P0_TIMEOUT;
import static org.hibernate.cfg.AvailableSettings.HBM2DDL_AUTO;
import static org.hibernate.cfg.AvailableSettings.SHOW_SQL;
import static org.hibernate.cfg.AvailableSettings.FORMAT_SQL;
import static org.hibernate.cfg.AvailableSettings.DIALECT;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author suresh sampath
 */
@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("com.dao"), @ComponentScan("com.service"), @ComponentScan("com.controller")})
public class AppConfig {

	@Autowired
	private Environment env;

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(dataSource());
		factoryBean.setHibernateProperties(hibernateProperties());
		factoryBean.setPackagesToScan(new String[] { "com.model" });
		return factoryBean;
	}
	
	  @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName(env.getProperty("mysql.driver"));
	        dataSource.setUrl(env.getProperty("mysql.url"));
	        dataSource.setUsername(env.getProperty("mysql.user"));
	        dataSource.setPassword(env.getProperty("mysql.password"));
	        return dataSource;
	    }
	     
	    private Properties hibernateProperties() {
	        Properties props = new Properties();
	        props.put(SHOW_SQL, env.getProperty("hibernate.show_sql"));
			props.put(HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl.auto"));
			props.put(HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl.auto"));
			props.put(DIALECT, env.getProperty("hibernate.dialect"));
			props.put(FORMAT_SQL, env.getProperty("hibernate.format_sql"));

			props.put(C3P0_MIN_SIZE, env.getProperty("hibernate.c3p0.min_size"));
			props.put(C3P0_MAX_SIZE, env.getProperty("hibernate.c3p0.max_size"));
			props.put(C3P0_ACQUIRE_INCREMENT, env.getProperty("hibernate.c3p0.acquire_increment"));
			props.put(C3P0_TIMEOUT, env.getProperty("hibernate.c3p0.timeout"));
			props.put(C3P0_MAX_STATEMENTS, env.getProperty("hibernate.c3p0.max_statements"));
	        return props;        
	    }

	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		return transactionManager;
	}
	
	@Bean
	public ConsoleAppender consoleAppender() {
		ConsoleAppender consoleAppender = new ConsoleAppender();
		consoleAppender.setThreshold(Level.ALL);
		PatternLayout patternLayout = new PatternLayout();
		patternLayout.setConversionPattern("%d %-5p [%c{1}] %m %n");
		consoleAppender.setLayout(patternLayout);
		return consoleAppender;
	}

}
