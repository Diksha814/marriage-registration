package extra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropFile {
	public static void main(String[] args) throws IOException {
//		get the java representation object of the physical file
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\cd.properties");

//		load() -> Load all the keys from prop file
		Properties pObj = new Properties();
		pObj.load(fis);

//		Get the data
		String value = pObj.getProperty("admin_un");
		System.out.println(value);

////		Set the data
//		pObj.setProperty("Country", "Bharat");
//
//		FileOutputStream fos = new FileOutputStream("./src\\test\\resources\\cd.properties");
//
////		Save the data(if not done then it will delete previous data)
//		pObj.store(fos, "Country got added successfullyy!!!");

	}
}
