package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static ArrayList<Cbgv> listCbgv = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		short choose;
		do {
			MENU();
			System.out.println("Nhap lua chon cua bn la:");
			choose = sc.nextShort();
			switch(choose) {
			case 1:
				add();
				break;
			case 2:
				unistall();
				break;
			case 3:
				display();
				break;
			case 4:
				System.out.println("Good bye!!!");
				return;
			}
		}while(choose != 4);
	}
	
	private static void display() {
		// TODO Auto-generated method stub
		tiltle();
		for(Cbgv c: listCbgv) c.output();
	}

	private static void unistall() {
		sc.nextLine();
		// TODO Auto-generated method stub
		String ma;
		System.out.println("Giao vien bi xoa co ma giao vien la:");
		ma = sc.nextLine();
		
		for(int i = 0;i < listCbgv.size();i++) {
			if(listCbgv.get(i).getMaGV().equalsIgnoreCase(ma)) {
				listCbgv.remove(i);
			}
		}
	}

	private static void add() {
		// TODO Auto-generated method stub
		Cbgv newPerson = new Cbgv();
		newPerson.input();
		listCbgv.add(newPerson);
	}

	static void MENU() {
		System.out.println("1. Them Can Bo Giao Vien.");
		System.out.println("2. Xoa can bo theo ma so giao vien.");
		System.out.println("3. Hien thi thong tin cua Can Bo Giao Vien.");
		System.out.println("4. Dung chuong trinh!!!");
	}
	public static void tiltle() {
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %n","Ma GV","Luong Cung","Luong Thuong","Luong Phat","Tuoi","Ho Ten","Dia chi");
	}
}

