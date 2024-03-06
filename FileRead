import java.io.*;
import java.util.*;

public class FileReader {
	

	public static void main(String arg[]) throws IOException
	{
		
		FileInputStream fis=new FileInputStream("./info.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
	}

}
