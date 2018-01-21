package org.cj.java.training.essential.exception;

import java.io.Closeable;
import java.io.IOException;

public class CloseableResource implements Closeable {

	@Override
	public void close() throws IOException {
		System.out.println("Closed the resource successfully!");
	}

}
