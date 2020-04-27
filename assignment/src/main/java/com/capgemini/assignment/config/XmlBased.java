package com.capgemini.assignment.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.assignment.bean.Message;

public class XmlBased {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Message msg = context.getBean(Message.class);
		msg.print();
	}
	

}
