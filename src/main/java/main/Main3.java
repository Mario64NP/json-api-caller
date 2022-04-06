package main;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import domain.Comic;

public class Main3 {

	public static void main(String[] args) {
		
		try(FileReader in = new FileReader("niz_objekata.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			List<Comic> comics = Arrays.asList(gson.fromJson(in, Comic[].class));
			
			for(Comic c: comics)
				System.out.println(c);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}