package com.example.demo;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.ecommerce.config.BasicSecurityConfiguration;


@SpringBootApplication(scanBasePackages = { "com.ecommerce" })
@ComponentScan({ "com.ecommerce.services" })
@ComponentScan(basePackageClasses = { BasicSecurityConfiguration.class })
public class EcommerceOrderApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceOrderApplication.class, args);
	}

	@Value("${init-db:false}")
	private String initDatabase;

	@Value("${spring.datasource.url}")
	private String springDbUrl;

	@Value("${spring.security.user.name}")
	private String userName;

	@Value("${spring.security.user.password}")
	private String password;

	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;

	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		System.out.println("Driver class name: " + springDbUrl);
		System.out.println("Jdbc url " + springDbUrl);

		dataSource.setUrl(springDbUrl);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);

		return dataSource;
	}

}
