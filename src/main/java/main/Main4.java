package main;

import java.io.FileWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main4 {

	public static void main(String[] args) {
		
		JsonObject j = new JsonObject();
		j.addProperty("num", 1);
		j.addProperty("day", 2);
		j.addProperty("month", 3);
		j.addProperty("year", 4);
		j.addProperty("title", "Comic");
		j.addProperty("img", "http://site.com/image.jpg");

		try(FileWriter out = new FileWriter("rucni_upis.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			out.write(gson.toJson(j));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}