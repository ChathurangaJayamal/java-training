package org.cj.java.training.essential.initialisation;

import org.junit.Test;

public class InitClassTest {
	
	@Test
	public void test() {
		System.out.println("###### init class #######");
		InitClass c = new InitClass();
		
		System.out.println("\n##### init sub class #######");
		InitClass c2 = new InitSubClass();
		
	}

}
