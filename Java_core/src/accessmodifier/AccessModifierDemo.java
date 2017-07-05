package accessmodifier;

public class AccessModifierDemo {
	public int ID;
	private String Name;
	protected String Address;
	int Age;

	public void show() {

	}

	void show2() {
	}

	private void show3() {

	}

	protected void show4() {

	}
	
	public static void main (String args[]){
		AccessModifierDemo accessModifierDemo = new AccessModifierDemo();
		accessModifierDemo.show();
		accessModifierDemo.show2();
		accessModifierDemo.show3();
		accessModifierDemo.show4();
		
	}

}
