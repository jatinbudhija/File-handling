package package_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read_from_file 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\Selenium\\fileHandling.txt");
		FileReader fr = new FileReader(f);
		
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.print((char)a);
		}
		
		
	}

}
