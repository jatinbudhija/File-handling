package package_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class write_to_file 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\Selenium\\fileHandling2.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("My name is Jatin Budhija");
		bw.newLine();
		bw.write("welcome");
		bw.close();
		
		
		
	}

}
