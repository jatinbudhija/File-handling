package package_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class read_from_file1_write_to_file2 
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("D:\\Selenium\\file1.txt");
		File f2 = new File("D:\\Selenium\\file2.txt");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(f2,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s;
		
		while((s=br.readLine())!=null)
		{
			bw.newLine();
			bw.write(s);
		}
		bw.close();
		
	}

}

