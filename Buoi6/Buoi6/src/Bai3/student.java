package Bai3;

import java.util.ArrayList;

public class student {
	static ArrayList<student> ListHS = new ArrayList<>();
	//constant
	public static final String LASTNAME = "NO LASTNAME";
	public static final byte AGE = 0;
	public static final String ADDRESS = "NO ADDRESS";
	
	//properties
	private String lastName;
	private byte age;
	private String address;
	
	//Constructor
	public student() {
		this(student.LASTNAME, student.AGE , student.ADDRESS);
	}
	
	public student(String lastName, byte age, String address) {
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}

	public String getLastName() {
		return lastName;
	}

	public byte getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public student setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public student setAge(byte age) {
		this.age = age;
		return this;
	}

	public student setAddress(String address) {
		this.address = address;
		return this;
	}

	//orther's method
	@Override
	public String toString() {
		return "student [lastName=" + lastName + ", age=" + age + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		
		
		
	}
}
