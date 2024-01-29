package com.jpa.project.jpa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories
public class DbConfig {
	//Connection
	@Bean
	DriverManagerDataSource datasourec() {
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/jpaexample");
		ds.setUsername("root");
		ds.setPassword("password");
		return ds;
		
		
	}
	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean emf= new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(datasourec());
		emf.setPackagesToScan("com.jpa.project.jpa.entity");
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		emf.setPersistenceUnitName("jdbc");
		return emf;
	}
	@Bean
	PlatformTransactionManager platformTransactionManager(@Autowired EntityManagerFactory emf) {
		JpaTransactionManager jpaTransactionManager=new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(emf);
		
		return jpaTransactionManager;
		
	}

}
