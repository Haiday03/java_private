package Bai2;

import java.util.Scanner;

public class Favorite extends Honey {
	static Scanner sc = new Scanner(System.in);
	
	private String name;

	public Favorite() {
		
	}
	public Favorite(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void input() {
		System.out.println("input name'Favorite:");
		setName(sc.nextLine());
	}
	
	public void output() {
		System.out.printf("%-10s %n",getName());
	}
	
	
}
