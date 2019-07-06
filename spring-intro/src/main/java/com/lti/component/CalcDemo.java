package com.lti.component;

import org.springframework.stereotype.Component;

@Component("cd")
public class CalcDemo implements CalcInterface {

	public int add(int x, int y) {
	return x+y;
	}
}
