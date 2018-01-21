package org.cj.java.training.essential.exception;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class AutoCloseableTest {
	
	@Test
	public void handleExceptionTest() throws IOException {
		Assert.assertTrue(AutoCloseableApp.
				handleException(new CloseableResource(), false));
	}
	
	@Test(expected=RuntimeException.class)
	public void handleExceptionExceptionalFlowTest() throws IOException {
		try {
			Assert.assertTrue(AutoCloseableApp.
					handleException(new CloseableWithExceptionResource(), true));
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
			if (e.getSuppressed().length > 0)
				System.err.println("\t Suppressed: " + e.getSuppressed()[0].getMessage());
			throw e;
		}
	}
	
	@Test(expected=IOException.class)
	public void handleExceptionWithFinallyTest() throws IOException {
		Assert.assertTrue(AutoCloseableApp.
				handleExceptionWithFinally(new CloseableWithExceptionResource(), false));
	}
	
	@Test(expected=IOException.class)
	public void handleExceptionExceptionalFlowWithFinallyTest() throws IOException  {
		try {
			Assert.assertTrue(AutoCloseableApp.
					handleExceptionWithFinally(new CloseableWithExceptionResource(), true));
		} catch (IOException e) {
			System.err.println(e.getMessage());
			throw e;
		}
	}

}
