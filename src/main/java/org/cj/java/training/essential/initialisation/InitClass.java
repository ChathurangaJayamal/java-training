package org.cj.java.training.essential.initialisation;

/**
 *	Only the final methods should be called during initialization and from within constructors.
 *	Here Sub class constructor support method runs before the subclass constructor.
 */
public class InitClass {
	
	private int val = init();

	private int init() {
		print("init method to initialize a field.");
		return 0;
	}
	
	{
		val = 5;
		print("initialization block....");
		constructorSupportMethod();
	}
	
	static {
		print("static initialization block....");
	}
	
	InitClass() {
		print(" Constructor...");
		constructorSupportMethod();
	}
	
	static void print(String str) {
		System.out.println(InitClass.class.getSimpleName() + " " + str);
	}
	
	void constructorSupportMethod() {
		print("constructor support method");
	}

}
