package javaio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String args[]) {
		try {
			File file = new File("E:\\Blog.txt");

			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);

			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			String NAME = "Nguyen dang tuan";
			bufferedWriter.write(NAME);
			bufferedWriter.close();
			fileWriter.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
