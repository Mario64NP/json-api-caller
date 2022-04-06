package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import domain.Comic;

public class Main1 {

	public static void main(String[] args) {
		
		System.out.print("ID: ");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		s.close();
		
		try {
			URL url = new URL("https://xkcd.com/" + id + "/info.0.json");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			Gson gson = new GsonBuilder().create();
			Comic comic = gson.fromJson(in, Comic.class);
			
			in.close();
			System.out.println(comic);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}