package model;

public class Address {
	private int ID;
	private String TEN;
	

	public Address(int ID, String TEN) {
		this.ID = ID;
		this.TEN = TEN;

	}

	public Address() {
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getTEN() {
		return TEN;
		
	}

	public void setTEN(String TEN) {
		this.TEN = TEN;
	}

	
}
