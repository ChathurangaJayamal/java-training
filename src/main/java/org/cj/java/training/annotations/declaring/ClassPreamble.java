package org.cj.java.training.annotations.declaring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ClassPreamble(author = "Chathuranga", 
	currentRevision = 1.1, date = "4/12/2020", modifiers = { "Chathuranga" })
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ClassPreamble {
	String author();
	String date();
	double currentRevision();
	String lastModifiedBy() default "N/A";
	String lastModifiedDate() default "N/A";
	String[] modifiers();

}
