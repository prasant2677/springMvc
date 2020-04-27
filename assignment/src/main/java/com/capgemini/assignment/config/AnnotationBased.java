package com.capgemini.assignment.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.assignment.bean.Message;

public class AnnotationBased {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MsgConfig.class);
		Message msg = context.getBean(Message.class);
		msg.print();
		
		
	}

}
