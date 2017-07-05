package genericc;

import model.Address;

public class GenericDemo1<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String arg[]) {

		GenericDemo1<String> genericDemo1 = new GenericDemo1<String>();
		genericDemo1.setT("Nguyen Van A");

		GenericDemo1<Integer> genericDemo2 = new GenericDemo1<Integer>();
		genericDemo2.setT(11);
		System.out.println(genericDemo2.getT());
		GenericDemo1<Address> GenericDemo3 = new GenericDemo1<>();
		Address Address = new Address(11,"Ha Noi");
		GenericDemo3.setT(Address);
		System.out.println(GenericDemo3.getT().getTEN());

	}

}
