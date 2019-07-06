package com.lti.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallSpellChecker {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
		
		TextEditor c=(TextEditor) context.getBean("txtEdtr");
		c.load("This is the document");

		
	}
	

}
