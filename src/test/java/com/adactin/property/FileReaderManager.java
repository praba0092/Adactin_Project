package com.adactin.property;

import com.adactin.helper.ConfigurationReader;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance() {
		FileReaderManager helper = new FileReaderManager();
		return helper;

	}

	
	public ConfigurationReader getInstanceCR() throws Throwable {
		ConfigurationReader reader = new ConfigurationReader();
		return reader;

	}
}
