package Bai2;

import java.util.Scanner;

public class Honey extends Person {
	
	static Scanner sc = new Scanner(System.in);
	
	private int id;
	private short status;
	private Favorite favorite;
	
	public Honey() {
		
	}
	public Honey(int id, short status) {
		super();
		this.id = id;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public short getStatus() {
		return status;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setStatus(short status) {
		this.status = status;
	}
	public void input() {
		super.input();
		System.out.println("input id:");
		setId(sc.nextInt());
		
		System.out.println("input status:");
		setStatus(sc.nextShort());
		sc.nextLine();
		
		//favorite.input();
	}
	
	public void output() {
		super.output();
		System.out.printf("%-10d %-10d %n",getId(),getStatus());
		//favorite.output();
	}
	
}
