package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.Atm;
import com.lti.component.CalcDemo;
import com.lti.component.CalcInterface;
import com.lti.component.CurrencyConverter;
//import com.lti.component.HelloWorld;
import com.lti.component.InterfaceClass;
import com.lti.component.ReplaceE;

public class HelloTest {

	public static void main(String[] args) {
		//Loading Springs IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
		
		InterfaceClass ic = (InterfaceClass)context.getBean("hw");
		//System.out.println(ic.sayHello("Hi!"));
		//System.out.println(((HelloWorld) context.getBean("hw")).sayHello("Universe"));
		
		/*CalcInterface c=(CalcInterface) context.getBean("cd");
		System.out.println(c.add(4,55));*/
		
		/*CurrencyConverter cs=(CurrencyConverter) context.getBean("cc");
		System.out.println(cs.convertDollarsToRupees(10));
		
		ReplaceE re=(ReplaceE)context.getBean("replacee");
		System.out.println(re.replaceMe("SHAKEeL"));*/
		
		Atm at=(Atm)context.getBean("hdfc");
		at.withdraw();
	}

}
