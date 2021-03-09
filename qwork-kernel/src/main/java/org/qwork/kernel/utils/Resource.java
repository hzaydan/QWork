package org.qwork.kernel.utils;

import java.io.InputStream;

public class Resource {
	
	public static InputStream asStream(String resourceName) {
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(resourceName);
		return in;
	}

}
