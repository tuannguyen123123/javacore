package staticc;

public class StaticDemo {
	public static void main(String args[]) {
		Student s1 = new Student(111, "Hoang");
		Student s2 = new Student(222, "Thanh");
		Student s3 = new Student(111, "Hoang 1");
		Student s4 = new Student(222, "Thanh 2");
		Student s5 = new Student(333, "Nam 3 ");

		s1.disPlay();
		s2.disPlay();
		Student.change();
		s3.disPlay2();
		s4.disPlay2();
		s5.disPlay2();
	}
}

class Student {
	int rollno;
	String name;
	static String college = "BachKhoa";

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	void disPlay() {
		System.out.println(rollno + " " + name + " " + college);
	}

	static void change() {
		college = "QuocGia";
	}

	void disPlay2() {
		System.out.println(rollno + " " + name + " " + college);
	}
}
