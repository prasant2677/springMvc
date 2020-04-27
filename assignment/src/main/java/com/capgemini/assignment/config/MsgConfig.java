package com.capgemini.assignment.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.assignment.bean.Message;
import com.capgemini.assignment.bean.User;
@Configuration
public class MsgConfig {
	@Bean
	public Message getMessage() {
		
		Message msg = new Message();
		msg.setMessage("Prasant");
		return msg;
	}
	@Bean
	public User getUser() {
		
		User user = new User();
		user.setName("Ravi");
		
		return user;
	}

}
