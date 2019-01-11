package package_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read_line_by_line 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\Selenium\\fileHandling.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		
	}

}
