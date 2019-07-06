package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cc") //alternate to <bean id=""....>
public class CurrencyConverter {
	
	@Autowired
	private ExchangeRate exchangeRate;

	public double convertDollarsToRupees(double dollar) {
		
		return dollar*exchangeRate.exchangeRate();
	}
}
