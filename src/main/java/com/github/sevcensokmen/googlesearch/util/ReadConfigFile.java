package com.github.sevcensokmen.googlesearch.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {

	private Properties properties = new Properties();

	public ReadConfigFile() {
		try {
			InputStream input = getClass().getClassLoader()
					.getResourceAsStream(Constant.CONFIG_PROPERTIES_DIRECTORY);
			properties.load(input);
		} catch (IOException e) {
			System.out.println("Unable to load config");
		}
	}

	public String getBrowser() {
		return properties.getProperty("browser");
	}
}
