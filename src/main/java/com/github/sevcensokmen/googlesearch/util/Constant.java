package com.github.sevcensokmen.googlesearch.util;

import java.io.File;
import java.io.IOException;

public class Constant {

	public static String PATH;

	static {
		try {
			PATH = new File(".").getCanonicalPath();
		} catch (IOException e) {
			// Should not be here at all
		}
	}

	public final static String CONFIG_PROPERTIES_DIRECTORY = 
			"com/github/sevcensokmen/googlesearch/property/config.properties";

	public final static String GECKO_DRIVER_DIRECTORY = PATH
			+ "/src/test/java/com/github/sevcensokmen/googlesearch/resource/bin/geckodriver";

	public final static String CHROME_DRIVER_DIRECTORY = PATH
			+ "/src/test/java/com/github/sevcensokmen/googlesearch/resource/bin/chromedriver";
}
