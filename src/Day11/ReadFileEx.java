package Day11;

import java.io.*;

public class ReadFileEx {
	
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("test.txt");
			
			 int ch;

	            while ((ch = fr.read()) != -1) {
	                System.out.print((char) ch);
	            }

	            fr.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		}
		

}
