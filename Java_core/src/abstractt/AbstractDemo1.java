package abstractt;

public class AbstractDemo1 extends AbstractDemo {

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println(name);

	}

	@Override
	void show2() {
		// TODO Auto-generated method stub

	}

	public static void main(String args[]) {

		AbstractDemo1 d = new AbstractDemo1();
		d.name = "nguyen van C";
		d.show();
	}

}
