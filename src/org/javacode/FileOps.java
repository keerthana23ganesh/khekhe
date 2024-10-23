package org.javacode;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOps {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\user\\Downloads\\KIKI\\Add\\sample.txt");
	
	FileUtils.write(f, "Hello world");
	//to write the concatenation a file
	FileUtils.write(f, "java application created");
	//to append the content
	FileUtils.write(f, "python apps", true);
	//to override the content
	FileUtils.write(f, "selenium Automation", true);
	
	//to read the content in a file 
	List<String> readLines = FileUtils.readLines(f);
	for (String x : readLines) {
		System.out.println(x);
	}
}	
}