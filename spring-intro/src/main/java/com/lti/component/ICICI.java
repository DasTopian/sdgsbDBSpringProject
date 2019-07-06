package com.lti.component;

import org.springframework.stereotype.Component;

@Component("icici")
public class ICICI implements AllBanks{
	
	public void communicate() {
		System.out.println("HDFC is communicating with ICICI");
	}
	

}
