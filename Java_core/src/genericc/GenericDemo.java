package genericc;

public class GenericDemo<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public GenericDemo(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public static void main(String args[]) {

		GenericDemo<Integer, String> b = new GenericDemo<Integer, String>(12000111, "Nguyen van A");
		GenericDemo<String, String> b1 = new GenericDemo<String, String>("PH04424", "Nguyen van A");

	}

}
