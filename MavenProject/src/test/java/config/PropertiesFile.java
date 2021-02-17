package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();
	public static void main(String[] args) throws IOException {
		//getProperties();
		//setProperties();
		//getProperties();
	}
	
	public String getFilePath() throws IOException {

		InputStream istream = new FileInputStream("C:/Users/Canada/eclipse-workspace/MavenProject/src/test/java/config/config.properties");
		prop.load(istream);
		String filePath = prop.getProperty("filePath");
		return filePath;
		
	}

	public static void getProperties() throws IOException {

		InputStream istream = new FileInputStream("C:/Users/Canada/eclipse-workspace/MavenProject/src/test/java/config/config.properties");
		prop.load(istream);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
	}

	public static void setProperties() throws IOException {
		OutputStream ostream = new FileOutputStream("C:/Users/Canada/eclipse-workspace/MavenProject/src/test/java/config/config.properties");
		prop.setProperty("browser", "chrome");
		prop.store(ostream, "Browser is reset");
	}
	
	

}
