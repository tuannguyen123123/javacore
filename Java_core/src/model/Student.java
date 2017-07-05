package model;

import java.util.Comparator;

public class Student implements Comparable<Student> , Comparator<Student> {
	private int Id;
	private String Name;
	private int Age;
	
	public Student() {
		super();
	}
	public Student(int id, String name, int age) {
		super();
		Id = id;
		Name = name;
		Age = age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return (this.Name).compareTo(arg0.Name);
	}
	@Override
	public int compare(Student arg0, Student arg1) {
		
		return arg0.Age - arg1.Age;
	}
	


	
}
