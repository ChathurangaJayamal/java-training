package org.cj.java.training.essential.initialisation;

public class InitSubClass extends InitClass {
	
	private int val = init();

	private int init() {
		print("init method to initialize a field.");
		return 0;
	}
	
	{
		val = 5;
		print("initialization block....");
	}
	
	static {
		print("static initialization block....");
	}
	
	InitSubClass() {
		print(" Constructor...");
	}
	
	static void print(String str) {
		System.out.println(InitSubClass.class.getSimpleName() + " " + str);
	}
	
	void constructorSupportMethod() {
		print("constructor support method");
	}

}
