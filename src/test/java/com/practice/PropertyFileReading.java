package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;

public class PropertyFileReading extends CommonMethods {

	Properties prop;

	@Test
	public void read() {
		String filePath = System.getProperty("user.dir") + "/src/test/java/com/practice/example.properties";

		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String value = prop.getProperty("company");
		System.out.println(value);
		takeScreenshot("prop");
	}

}
