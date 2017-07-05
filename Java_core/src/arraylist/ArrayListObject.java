package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import javax.security.auth.Subject;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import model.Student;

public class ArrayListObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "Cảnh", 1991));
		arrayList.add(new Student(5, "Tuấn", 1992));
		arrayList.add(new Student(9, "Việt", 1994));
		arrayList.add(new Student(9, "Việt", 1994));
		arrayList.add(new Student(1, "Cảnh", 1993));
		arrayList.add(new Student(1, "Liên", 1991));
		arrayList.add(new Student(1, "Liên", 1990));
		arrayList.add(new Student(1, "Quỳnh", 1992));
		System.out.println("Before arrangement");

		List<Student> lstStudent = new ArrayList();

		// loai bo cac phan tu trung nhau

		for (int i = 0; i < arrayList.size(); i++) {
			if (lstStudent.size() == 0) {
				lstStudent.add(arrayList.get(i));
			} else {
				boolean checkNotExists = true;
				for (int a = 0; a < lstStudent.size(); a++) {
					if (String.valueOf(lstStudent.get(a).getId()).contains(String.valueOf(arrayList.get(i).getId()))) {
						checkNotExists = false;
						break;
					}
				}
				if (checkNotExists) {
					lstStudent.add(arrayList.get(i));
				}
			}
		}
		System.out.println("Different types of phuan tu different");
		for (Student student : lstStudent) {
			System.out.println("" + student.getName());

		}

		for (Student item : arrayList) {
			System.out.println(item.getName());
		}
		Collections.sort(arrayList);
		System.out.println("After arranging");
		for (Student item : arrayList) {
			System.out.println(item.getName());
		}
		Collections.sort(arrayList, new Student());
		System.out.println(" ");
		for (Student item : arrayList)// in danh sach da qua sap xep cua age
		{
			System.out.println(item.getName() + item.getAge());
		}
	}
}
