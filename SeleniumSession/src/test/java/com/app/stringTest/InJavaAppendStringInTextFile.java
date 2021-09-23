package com.app.stringTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InJavaAppendStringInTextFile {
	
	
	public void appendString(String str) throws IOException
	{
		//E:\\AutomationWorkSpace\\SeleniumJava\\JavaTestProject\\Files
		File file= new File("E:\\AutomationWorkSpace\\SeleniumJava\\JavaTestProject\\Files\\TestFile2.txt");
		BufferedWriter bw=null;
		FileWriter fw =null;
		
		
		
		try {
			if(!file.exists())
			{
				file.createNewFile();
			}
			else 
			{
				fw = new FileWriter(file.getAbsoluteFile(), true);
				bw = new BufferedWriter(fw);
				bw.write(str);
			}
		}
			
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		finally{
			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}

	
	public static void main(String[] args) throws IOException {
		InJavaAppendStringInTextFile obj= new InJavaAppendStringInTextFile();
		obj.appendString("Imran");
	}
}
