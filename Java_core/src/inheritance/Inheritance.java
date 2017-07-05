package inheritance;

public class Inheritance {
	public static void main(String args[]) {
		Animal d = new BabyDog();
		d.eat();
		BabyDog d2 = new BabyDog();
		d2.weep();
		d2.bark();
		d2.eat();
	}
}

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}
