package main;

import java.io.FileWriter;
import java.io.PrintWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import domain.Comic;

public class Main2 {

	public static void main(String[] args) {
		
		Comic comics[] = new Comic[3];
		
		for (int i = 0; i < 3; i++) {
			comics[i] = new Comic(i, i, i, i, ""+i, ""+i);
			System.out.println(comics[i]);
		}
	
		try(PrintWriter out = new PrintWriter(new FileWriter("niz_objekata.json"))){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			out.print(gson.toJson(comics));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}