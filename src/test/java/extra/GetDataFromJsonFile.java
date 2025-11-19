package extra;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetDataFromJsonFile {
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader fr = new FileReader("C:\\Users\\User\\git\\ocmrs\\marriage-registration\\src\\test\\resources\\commondata.json");
		
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(fr);
		
		JSONObject jObj = (JSONObject) obj ;
		
		String mob = jObj.get("key1").toString();
		String name = jObj.get("key2").toString();
		System.out.println(mob);
		System.out.println(name);
	}
}
