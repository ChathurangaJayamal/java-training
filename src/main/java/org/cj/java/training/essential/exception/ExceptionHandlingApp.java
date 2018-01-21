package org.cj.java.training.essential.exception;

import java.io.Closeable;
import java.io.IOException;

public class ExceptionHandlingApp {

	/**
	 * Exception in finally block will be suppressed by try block exception
	 * @return true if no exceptions
	 * @throws IOException
	 */
	public static boolean handleException(Closeable open, boolean exceptionInTry) throws IOException {

		try (Closeable resource = open) {
			if (exceptionInTry) throw new RuntimeException("Exceptional flow test");
			return true;
		}
	}

	/**
	 * Exception in try block will be suppressed by finally block exception
	 * @return true if no exceptions
	 * @throws IOException
	 */
	public static boolean handleExceptionWithFinally(Closeable open, boolean exceptionInTry) throws IOException {

		try {
			if (exceptionInTry) throw new RuntimeException("Exceptional flow test");
			return true;
		} finally {
			open.close();
		}
	}

}
