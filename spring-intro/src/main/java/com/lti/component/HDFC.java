package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hdfc")
public class HDFC implements Atm {
	
	@Autowired
	@Qualifier("icici")
	private AllBanks bank;
	
	public void withdraw() {
		System.out.println("Withdrawing money from HDFC Bank");
		bank.communicate();
	}
}
