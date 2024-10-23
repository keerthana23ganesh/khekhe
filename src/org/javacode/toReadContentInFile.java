package org.javacode;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class toReadContentInFile {

public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\user\\Downloads\\kiki\\sample.txt");
FileUtils.write(f, "Java selenium python");

List<String> l=new FileUtils().readLines(f);
for (String x : l) {
	System.out.println(x);
	
}

}
}
