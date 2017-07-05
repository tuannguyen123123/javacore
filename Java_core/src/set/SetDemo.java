package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String args[]) {
		int count[] = { 34, 22, 10, 60, 30, 22 };
		Set<Integer> set = new HashSet<Integer>();
		try {
			for (int i = 0; i < 5; i++) {
				set.add(count[i]);
			}
			System.out.println(set);
			TreeSet sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is : ");
			System.out.println(sortedSet);
			System.out.println("The first element of the set is: " + (Integer) sortedSet.first());
			System.out.println("The last element : " + (Integer) sortedSet.last());
			System.out.println("Check that the set has an element with no element" + set.isEmpty());
			System.out.println("count number" + set.size());
			// kiểm tra bằng nhau hoặc giống nhau
			// set.contains();
			// set.equals()

			System.out.println("Check that the set has an element with no element  " + set.isEmpty());
			System.out.println("Delect   " + set.remove(2));
			System.out.println("Export to Ma    " + set.hashCode());

		} catch (Exception e) {
		}
	}
}
