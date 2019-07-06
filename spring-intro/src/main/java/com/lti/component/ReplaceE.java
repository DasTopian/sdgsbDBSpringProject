package com.lti.component;

import org.springframework.stereotype.Component;

@Component("replacee")
public class ReplaceE {
	public String replaceMe(String a) {
		char[] ar=a.toCharArray();
		for(int i=0;i<a.length();i++) {
		ar[i]=(ar[i]=='e')?'3':ar[i];
		}
	a=new String(ar);
	return a;
	}
}
