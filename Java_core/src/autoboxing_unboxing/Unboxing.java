package autoboxing_unboxing;

public class Unboxing {

	public static void main(String[] args) {

		Integer i = 10;
		int j = i.intValue();

		Double myDouble = new Double(10.2);
		double myDouble2 = myDouble.doubleValue();

		Float myFloat = new Float(10.2F);
		float myFloat2 = myFloat.floatValue();

	}

}
