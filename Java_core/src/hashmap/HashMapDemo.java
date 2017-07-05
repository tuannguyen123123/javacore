package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import model.Student;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Double> hm = new HashMap();
		// Dat cac phan tu vao map
		hm.put("Zara", new Double(3434.34));
		hm.put("Mahnaz", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));
		hm.put("Qadir", new Double(-19.08));

		// Lay mot tap hop cac entry
		Set set = hm.entrySet();
		// Lay mot iterator
		Iterator i = set.iterator();
		// Hien thi cac phan tu
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		HashMap<Integer, Student> listStudent = new HashMap();
		listStudent.put(1, new Student(1, "Cảnh", 1991));
		listStudent.put(2, new Student(5, "Tuấn", 1992));
		listStudent.put(3, new Student(9, "Việt", 1994));
		listStudent.put(4, new Student(9, "Việt", 1994));
		listStudent.put(5, new Student(1, "Cảnh", 1993));
		listStudent.put(1, new Student(1, "Liên", 1991));
		listStudent.put(5, new Student(1, "Liên", 1990));
		listStudent.put(8, new Student(1, "Quỳnh", 1992));

		Set set2 = listStudent.entrySet();
		Iterator iterator = set2.iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();

			System.out.println("key :" + me.getKey() + "   ID   :" + listStudent.get(me.getKey()).getId() + "   NAME  :"
					+ listStudent.get(me.getKey()).getName());
		}

		System.out.println("" + listStudent.hashCode());
		System.out.println("" + listStudent.size());
	}
}