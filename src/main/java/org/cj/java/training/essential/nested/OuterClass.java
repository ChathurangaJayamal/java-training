package org.cj.java.training.essential.nested;

public class OuterClass {
	
	private String outerStr = "";
	private static String outerStaticStr = "";
	
	void method() {
		InnerClass innerClass = new InnerClass();
		innerClass.var = "Re-assigned";
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		staticNestedClass.var = "";
	}
	
	static void staticMethod() {
//		StaticNestedClass.var = ""; no access
		StaticNestedClass.staticVar = "";
	}
	
	/** <ul><li>A non-static nested class is called an Inner class</li>
	 * <li>Is associated with the enclosing class</li>
	 * <li>Non-static nested classes (inner classes) have access to 
	 * other members of the enclosing class, even if they are declared private.</li> */
	class InnerClass {
		String var = "Inner";
		{
			outerStr = "";
		}
	}

	/**
	 * <h3>A static nested class</h3>
	 * <li>is <b>not</b> associated with an enclosing class</li>
	 * <li>a static nested class cannot refer directly to instance variables 
	 * or methods defined in its enclosing class: 
	 * it can use them only through an object reference.</li>
	 */
	static class StaticNestedClass {
		String var = "StaticNested-non-static-variable";
		static String staticVar = "Static Variable";
		
		{
//			outerStr = ""; doesn't have access
			outerStaticStr = "";
			staticMethod();
//			method(); no access
			var = "";
		}
	}
	
	void sayGoodbyeInEnglish() {
		String goodByestr = ":)";
        class EnglishGoodbye {
            public static final String farewell = "Bye bye";
            public void sayGoodbye() {
                System.out.println(farewell);
                outerStr = "";
                outerStaticStr = "";
//                goodByestr = ""; MUST be effectively final
                System.out.println(goodByestr);
            }
        }
        EnglishGoodbye myEnglishGoodbye = new EnglishGoodbye();
        myEnglishGoodbye.sayGoodbye();
    }
	
	/**
	 * Local class
	 * <li>has access to the members of its enclosing class (if enclosing block has the access).</li>
	 * <li>a local class can access 
	 * local variables and parameters of the enclosing block that are final or effectively final.</li>
	 */
	static void sayGoodbyeInEnglishStatic() {
        class EnglishGoodbye {
            public String farewell = "Bye bye";
            public void sayGoodbye() {
            	farewell = "Bye Bye Bye";
                System.out.println(farewell);
                outerStaticStr = "";
//                outerStr = ""; NO ACCESS
            }
        }
        EnglishGoodbye myEnglishGoodbye = new EnglishGoodbye();
        myEnglishGoodbye.sayGoodbye();
    }
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.sayGoodbyeInEnglish();
		
		OuterClass.sayGoodbyeInEnglishStatic();
	}
}
