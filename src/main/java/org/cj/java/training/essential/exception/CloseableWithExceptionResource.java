package org.cj.java.training.essential.exception;

import java.io.Closeable;
import java.io.IOException;

public class CloseableWithExceptionResource implements Closeable {

	@Override
	public void close() throws IOException {
		throw new IOException("Closing this resource throws IOException!");
	}

}
