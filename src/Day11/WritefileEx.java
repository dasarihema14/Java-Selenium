package Day11;

import java.io.*;

public class WritefileEx {
	public static void main(String[] args) {
	try {
		FileWriter fw=new FileWriter("C:\\hema\\test.txt");
		fw.write("hiii");
		fw.write("Welcome");
		fw.close();
		System.out.println("File is written");
	}
	catch(IOException e) {
		e.printStackTrace();
		
	}
	}
	

}
