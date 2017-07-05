package finall;

public class FinalDemo extends Bike {

	@Override
	void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	// Can not write over run2()
	// @Override
	// void run2() {
	// // TODO Auto-generated method stub
	// super.run();
	// }

}

class Bike {
	final int speedlimit = 90;// bien final

	void run() {

		// Can not change speedlimit
		// speedlimit=400;
	}

	final void run2() {
		System.out.println("function final");

	}
}
// Can not  extends
final class Bike1 {
	void run() {
		System.out.println("class final");

	}

}