/**
 * 
 */
package FirstTestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author general
 *
 */
public class TestProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("C:\\Users\\general\\eclipse-workspace\\TestProperty.properties");
		try {
			FileInputStream fis = new FileInputStream(f);
			Properties p = new Properties();
			p.load(fis);
			String s = p.get("name").toString();
			System.out.println(s);
			p.setProperty("name3", "testingfromProgram");
			String prop = p.get("name3").toString();
			System.out.println(prop);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
