package autoboxing;

public class Testautoboxing {

	public static void main(String args[]) {
		// Chuyen doi int thanh Integer
		int a = 20;
		Integer i = Integer.valueOf(a);// Chuyen doi int thanh Integer
		Integer j = a;// Day la autoboxing, bay gio compiler se viet la
						// Integer.valueOf(a)
		System.out.println(a + " " + i + " " + j);
		Double p = new Double(3.2);
		double n = p.doubleValue();
		double g = p;// Day la unboxing, bay gio compiler se viet la
						// a.intValue()
		System.out.println(p + " " + n + " " + g);

		Boolean b = new Boolean(true);
		boolean c = b.booleanValue();
		boolean d = b;
		System.out.println(b + " " + c + " " + d);

		boolean x = false;
		Boolean z = Boolean.valueOf(x);
		Boolean v = x;
		System.out.println(x + " " + z + " " + v);
	}
}
