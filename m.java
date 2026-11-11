package program2.varsha2;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

public class ReadJson {

	public static void main(String[] args) throws IOException,ParseException,org.json.simple.parser.ParseException {
		JSONParser jsonParser=new JSONParser();
		FileReader reader=new FileReader(".\\Json\\student.json");
		Object obj=jsonParser.parse(reader);
		JSONObject studentobj=(JSONObject)obj;
		String fname=(String) studentobj.get("firstname");
		String lname=(String) studentobj.get("lastname");
		System.out.println("Firstname:"+fname);
		System.out.println("Lastname:"+lname);
	}
}
