package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

import model.Address;
import model.Student;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("Show LinkedList: " + ll);

		// Delect 1 list
		ll.remove("F");
		ll.remove(2);
		System.out.println("show one linkedlist present " + ll);

		// xoa cac phan tu dau tien va cuoi cung
		ll.removeFirst();
		ll.removeLast();
		System.out.println("show one linkelist present  delect " + ll);

		// lay va thiet lap mot gia tri
		Object val = ll.get(2);
		System.out.println("Get the second element linkedlist" + val);
		ll.set(2, (String) val + " Dathaydoi");
		System.out.println("lay phan tu" + ll.get(2));
		System.out.println("-- Check linkedlist is empty -----------------------------");
		System.out.println("LinkedList is empty: " + ll.isEmpty());

		// LinkedList vs objce
		LinkedList<Student> listStudent = new LinkedList<>();
		listStudent.add(new Student(1, "Cảnh", 1991));
		listStudent.add(new Student(5, "Tuấn", 1992));
		listStudent.add(new Student(9, "Việt", 1994));
		listStudent.add(new Student(1, "Tú Anh", 1993));
		listStudent.add(new Student(1, "Liên", 1991));
		listStudent.add(new Student(1, "Hiệp", 1990));
		listStudent.add(new Student(1, "Quỳnh", 1992));
		Collections.sort(listStudent, new Student());
		for (int i = 0; i < listStudent.size(); i++) {
			System.out.println("Get Name  the   llDiachi   " + listStudent.get(i).getName());

		}

		// LinkedList loai bo phan tu trung nhau
		LinkedList ll2 = new LinkedList();
		for (int i = 0; i < ll.size(); i++) {
			if (ll2.size() == 0) {
				ll2.add(ll.get(i));
			} else {
				boolean checkNotExists = true;
				for (int a = 0; a < ll2.size(); a++) {
					if (String.valueOf(ll2.get(a)).contains(String.valueOf(ll.get(i)))) {
						checkNotExists = false;
						break;
					}
				}
				if (checkNotExists) {
					ll2.add(ll.get(i));
				}
			}
		}
		System.out.println("Neutral element filtering");

		for (int i = 0; i < ll2.size(); i++) {
			System.out.println("" + ll2.get(i));

		}

	}

}
