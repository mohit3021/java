package Hello;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClass {

	
	String result2 = new String();
    String result = new String();

	
		public void Original() throws IOException
		{
		    FileInputStream fis = new FileInputStream("C:\\Users\\mohitkumar.sharma\\Desktop\\fhfd\\Original_TextFile.txt");
		    InputStreamReader input = new InputStreamReader(fis);
		    BufferedReader br = new BufferedReader(input);
		    String data;

		    while ((data = br.readLine()) != null) 
		    {
		        result = result.concat(data + " ");
		    }

		    System.out.println(result);
		    
		}
		
		public void OCTTika() throws IOException
		{
		    FileInputStream fis2 = new FileInputStream("C:\\Users\\mohitkumar.sharma\\Desktop\\fhfd\\TextFile_OCR_UsingTIKA.txt");
		    InputStreamReader input2 = new InputStreamReader(fis2);
		    BufferedReader br2 = new BufferedReader(input2);
		    String data2;
		    

		    while ((data2 = br2.readLine()) != null) 
		    {
		        result2 = result2.concat(data2 + " ");
		    }

		    System.out.println(result2);
		    
		    String result3=result2.replaceAll("\r\n", "\n");
		    System.out.println(result3);
		    }
		
		public void compare()
		{ 
			if(result.equalsIgnoreCase(result2))
			{
				System.out.println("Files are matcherd");
			}
			else 
			{
			System.out.println("File not matched");	
			}
			
		}
	
	
		public static void main(String[] args) throws IOException 
		{
			MyClass cls=new MyClass();
			cls.Original();
			cls.OCTTika();
			cls.compare();
			
		}
		
	}
	




