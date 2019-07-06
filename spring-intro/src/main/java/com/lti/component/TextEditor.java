//dependency injection example
//text editor depends on spll
package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txtEdtr")
public class TextEditor {
	
	//DI
	//Field Injection
	@Autowired
	private SpellChecker sp; //Injection Point
	
	public void load(String doc) {
		System.out.println(doc+" Loaded....");
		
		//SpellChecker sc=new SpellChecker();
		sp.spellCheck(doc);
		
	}

}
