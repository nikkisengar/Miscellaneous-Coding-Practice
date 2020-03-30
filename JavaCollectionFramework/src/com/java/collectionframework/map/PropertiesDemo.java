package com.java.collectionframework.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		Properties p = new Properties();

		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);

		System.out.println("Properties are: \n" + p);

		String s = p.getProperty("venki");
		System.out.println("Values associated with venki is: \n" + s);

		p.setProperty("nag", "nag123");

		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos, "added a new property...");
	}

}
