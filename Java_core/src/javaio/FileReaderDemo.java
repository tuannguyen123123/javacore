package javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String args[]) {

		File file = new File("Blog.txt");
		try {

			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);

			}

			bufferedReader.close();
			fileReader.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
