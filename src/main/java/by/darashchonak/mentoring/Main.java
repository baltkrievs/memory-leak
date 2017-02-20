package by.darashchonak.mentoring;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		String line = null;

		BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
		try {

			List<String> strList = new ArrayList<String>();
			line = reader.readLine();

			while (line != null) {

				strList.add(line.substring(0, 2));
				line = reader.readLine();
			}
		} finally {
			reader.close();
		}

		System.in.read();

	}

}
