package javaio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		try {
			
			File dir = new File("C:/Test");
			// Tao thu muc C:/Test
			dir.mkdirs();
			// Tạo một luồng ký tự đầu ra với mục đích ghi thông tin vào file
			OutputStream w = new FileOutputStream("C:/Test/test_outputStream.txt");

			// Tạo một mảng byte ,ta sẽ ghi các byte này vào file nói trên .
			byte[] by = new byte[] { 'H', 'e', 'l', 'l', 'o' };

			// Ghi lần lượt các ký tự vào luồng
			for (int i = 0; i < by.length; i++) {
				byte b = by[i];
				// Ghi ký tự vào luồng
				w.write(b);
			}
			// �?óng luồng đầu ra lại việc ghi xuống file hoàn tất.
			w.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
