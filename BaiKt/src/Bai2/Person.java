package Bai2;

import java.util.Scanner;

public class Person {
	static Scanner sc = new Scanner(System.in);
	
	private String name;
	private short age;
	private String gender;
	private int phone;
	
	public Person() {
		
	}
	public Person(String name, short age, String gender, int phone) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public short getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public int getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public void input() {
		System.out.println("input name:");
		setName(sc.nextLine());
		
		System.out.println("input age:");
		setAge(sc.nextShort());
		sc.nextLine();
		
		System.out.println("input gender:");
		setGender(sc.nextLine());
		
		System.out.println("input phone:");
		setPhone(sc.nextInt());
	}
	
	public void output() {
		System.out.printf("%-10s %-10d %-10s %-10d",getName(),getAge(),getGender(),getPhone());
	}
	
}
