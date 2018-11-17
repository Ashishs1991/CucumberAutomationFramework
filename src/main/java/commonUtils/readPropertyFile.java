package commonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFile {
	
	File file;
	FileInputStream fis;
	public Properties prop;
	
	
	public readPropertyFile() throws IOException {
		file=new File("C:\\Users\\Ashish Sharma\\eclipse-workspace"
				+ "\\TestFramework\\src\\test\\resources"
				+ "\\config.properties");
		fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);
	}

}
