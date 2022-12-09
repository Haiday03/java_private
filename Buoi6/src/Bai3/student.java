package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class student {
	static Scanner sc = new Scanner(System.in);
	//static ArrayList<student> ListHS = new ArrayList<>();
	//constant
	public static final String LASTNAME = "NO LASTNAME";
	public static final byte AGE = 0;
	public static final String ADDRESS = "NO ADDRESS";
	
	//properties
	private String lastName;
	
	private byte age;
	
	private String address;
	
	private Lop lop = new Lop();
	
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

	public void input() {
		//sc.nextLine();
		System.out.println("input student's name :");
		setLastName(sc.nextLine());
		
		System.out.println("input student's age :");
		setAge(sc.nextByte());
		
		sc.nextLine();
		System.out.println("input student's address :");
		setAddress(sc.nextLine());
		
		lop.input();
	}
	
	public void output() {
		System.out.printf("%-20s %-20d %-20s",lastName,age,address);
		lop.output();
	}
}
