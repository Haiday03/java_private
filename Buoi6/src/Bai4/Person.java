package Bai4;

import java.util.Scanner;

public class Person {
	protected static Scanner sc = new Scanner(System.in);
	
	//properties
	protected String name;
	protected short age;
	protected String address;
	
	//contructor
	
	public Person(){
	}
	public Person(String name,short age,String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public short getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void input() {
		sc.nextLine();
		System.out.println("input name :");
		setName(sc.nextLine());
		
		System.out.println("input age:");
		setAge(sc.nextShort());
		sc.nextLine();
		
		System.out.println("input address:");
		setAddress(sc.nextLine());
	}
	
	public void output() {
		System.out.printf("%-15s %-10d %-15s %n",getName(),getAge(),getAddress());
	}

}
