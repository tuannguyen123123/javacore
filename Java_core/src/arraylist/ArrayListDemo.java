package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Hà Nội");
		arrayList.add("Đà Nẵng");
		arrayList.add("Nha Trang");
		arrayList.add("TP.Hồ Chí Minh");
		System.out.println("Before arrangement");
		for (String item : arrayList) {
			System.out.println(item);
		}
		Collections.sort(arrayList);
		System.out.println("After arranging");
		for (String item : arrayList) {
			System.out.println(item);
		}

		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(10);
		arrayList1.add(2);
		arrayList1.add(221);
		arrayList1.add(991);
		System.out.println("Before arrangement");
		for (Integer i : arrayList1) {
			System.out.println(i);
		}
		Collections.sort(arrayList);
		System.out.println("After arranging");
		for (Integer item : arrayList1) {
			System.out.println(item);
		}
		
		
	}

}
