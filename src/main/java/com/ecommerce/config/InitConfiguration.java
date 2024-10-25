package com.ecommerce.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.init.DataSourceInitializer;
//import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.ecommerce.model.ShoppingCart;
import com.ecommerce.services.CheckOutService;
import com.ecommerce.services.CheckOutServiceImpl;
import com.ecommerce.services.CustomerHistoryService;
import com.ecommerce.services.CustomerHistoryServiceImpl;
import com.ecommerce.services.PaymentService;
import com.ecommerce.services.PaymentServiceImpl;


@Component
@EnableTransactionManagement
@PropertySource(value = { "classpath:application.properties" })
public class InitConfiguration{


    @Autowired
    private Environment env;
    
	 
	private boolean value;
    private String message;
    private int number;
    
    public InitConfiguration() {
    	
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
   
     
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }    
 
    
    @Bean
    public View jsonTemplate() {
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrettyPrint(true);
        return view;
    }

    @Bean
    public ViewResolver viewResolver() {
        return new BeanNameViewResolver();
    }
    
    @Bean
	public CustomerHistoryService getCustomerHistoryService() {
		return new CustomerHistoryServiceImpl();
	}

    @Bean
	public PaymentService getPaymentService() {
		return new PaymentServiceImpl();
	}
    
    @Bean ShoppingCart getShoppingCart() {
    	return new ShoppingCart();
    }
    
    @Bean
	public CheckOutService getCheckoutService() {
		return new CheckOutServiceImpl(getShoppingCart());
	}
    

}
