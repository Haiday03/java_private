package buoi7;

import java.util.Scanner;

public class Person {
	//Modifier :public ,private ,protected ,default
	//Tinh dong goi du lieu: nhung thuoc tinh o lop nao thi 
	//thuoc ve lop day,no co phep goi su dung o trong lop day
	
	
	//Tinh ke thua thi nhung thuoc tinh cua class cha thi se de la protected
	
	//Don ke thua
	protected String name;
	protected String diaChi;
	protected int tuoi;
	
	public Person() {
		
	}
	public Person(String name, String diaChi, int tuoi) {
		this.name = name;
		this.diaChi = diaChi;
		this.tuoi = tuoi;
	}
	public String getName() {
		return name;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	//Ghi de phuong thuc
	public void thucDay() {
		System.out.println(" Thuc day luc 7h sang");
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ten :");
		setName(sc.nextLine());
		
		System.out.println("Nhap dia chi :");
		setDiaChi(sc.nextLine());
		
		System.out.println("Nhap tuoi :");
		setTuoi(sc.nextInt());
		
		sc.nextLine();
	}
	
	public void output() {
		System.out.printf("%-10s %-10s %-10d",getName(),getDiaChi(),getTuoi());
	}
}
