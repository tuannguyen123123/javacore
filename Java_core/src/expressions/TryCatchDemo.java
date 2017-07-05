package expressions;

public class TryCatchDemo {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Number one");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("TNumber tow");
		} catch (Exception e) {
			System.out.println("Number max");
		}

		System.out.println("Number ");
	}

}
