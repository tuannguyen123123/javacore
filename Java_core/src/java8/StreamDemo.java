package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Student;

public class StreamDemo {

	public void showSum(int i, int j) {
	}

	public static void main(String args[]) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach(n -> System.out.println(n));

		List<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "Cảnh", 1991));
		arrayList.add(new Student(5, "Tuấn", 1992));
		arrayList.add(new Student(9, "Việt", 1994));
		arrayList.add(new Student(9, "Việt", 1994));
		arrayList.add(new Student(1, "Cảnh", 1993));
		arrayList.add(new Student(1, "Liên", 1991));
		arrayList.add(new Student(1, "Nu", 1990));
		arrayList.add(new Student(1, "Nu", 1992));

		arrayList.forEach((n) -> {

			System.out.println(n.getName());
		});
		System.out.println("------------");
		arrayList.stream().sorted((student1, student2) -> student1.getName().compareTo(student2.getName()))
				.collect(Collectors.toList());
		System.out.println("------------");
		arrayList.stream().filter(student -> student.getName().equalsIgnoreCase("Nu"))
				.forEach(p -> System.out.println(p.getAge()));
		System.out.println("------------");
		arrayList.stream().filter(student -> student.getName().equalsIgnoreCase("Nu")).forEach(System.out::println);
		System.out.println("------------");
		arrayList.stream().map(Student::getName).forEach(System.out::println);
		System.out.println("------------");
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		// get count of empty string
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Show sum cuout" + count);
		System.out.println("------------");
		List numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream().limit(5).forEach(System.out::println);

	}

}
