package treeset;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.Arrays;
import model.Student;

public class TreeSetDemo {
	public static void main(String args[]) {

		TreeSet tree = new TreeSet();
		tree.add(12);
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(45);

		Iterator iterator = tree.iterator();
		System.out.print("Tree set data: " + tree.size());
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");

			if (tree.equals(63)) {
				System.out.print("Exists number 63");

			}
			if (tree.contains(12)) {
				System.out.print("Exists number 12");
				tree.add(77);

			}
			tree.clear();
		}
		System.out.println("Check that the set has an element with no element  " + tree.isEmpty());
		System.out.println("Delect   " + tree.remove(2));
		System.out.println("Export to Ma    " + tree.hashCode());

		// TreeSet<Student> listTreeSetStudent = new TreeSet<>();
		// listTreeSetStudent.add(new Student(1, "Cảnh", 1991));
		// listTreeSetStudent.add(new Student(3, "Tuấn", 1992));
		// listTreeSetStudent.add(new Student(9, "Việt", 1994));
		// listTreeSetStudent.add(new Student(1, "Cảnh", 1993));
		// listTreeSetStudent.add(new Student(4, "Liên", 1991));
		// listTreeSetStudent.add(new Student(1, "Liên", 1990));
		// listTreeSetStudent.add(new Student(4, "Liên", 1991));
		// listTreeSetStudent.add(new Student(8, "Quỳnh", 1992));
		// listTreeSetStudent.add(new Student(9, "Việtt", 19946));
		// for (Student student : listTreeSetStudent) {
		// System.out.println(student.getName() + student.getAge() + "ID :" +
		// student.getId());
		//
		// }
		//
	}

}
