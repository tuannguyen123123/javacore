package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Student;

public class StreamDemo {

	public void showSum(int i, int j) {
	}

	public static void main(String args[]) {
		List<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "Cảnh", 1991));
		arrayList.add(new Student(2, "Nam", 1992));
		arrayList.add(new Student(4, "Việt", 1994));
		arrayList.add(new Student(9, "coi", 1994));
		arrayList.add(new Student(3, "buom", 1993));
		arrayList.add(new Student(5, "Liên", 1991));
		arrayList.add(new Student(7, "hung", 1990));
		arrayList.add(new Student(6, "Nu", 1992));
		arrayList.add(new Student(11, "Nu", 1993));
		System.out.println("------------");
		arrayList.stream().sorted((student1, student2) -> student1.getName().compareTo(student2.getName()))
				.collect(Collectors.toList());

		arrayList.forEach((n) -> {

			System.out.println(n.getName());
		});
		System.out.println("---f---------");
		List<Student> a = (List<Student>) arrayList.stream().filter(student -> student.getName().equals("Nu"))
				.collect(Collectors.toList());

		Student result1 = arrayList.stream().filter((p) -> p.getName().equals("Nu")).findAny().orElse(null);
		for (Student student : a) {
			System.out.println(student.getId());

		}
		// if(result1!= null) {
		// System.out.println(result1.toString());
		// }
		Collections.sort(arrayList, new Comparator<Student>() {
			@Override
			public int compare(Student fruit2, Student fruit1) {
				return fruit2.getName().compareToIgnoreCase(fruit1.getName());
			}
		});

		List<String> collect = arrayList.stream().map(Student::getName).collect(Collectors.toList());

		System.out.println("---soft---------");
		for (Student student : arrayList) {
			System.out.println(student.getName());

		}

	}

}
