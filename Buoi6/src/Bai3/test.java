package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	static ArrayList<student> ListHS = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		byte choose;
		do {
			Menu();
			System.out.println("Nhap lua chon cua ban :");
			choose = sc.nextByte();
				switch(choose) {
					case 1:
						them();
						break;
					case 2:
						xuat();
						break;
					case 3:
						hs20tuoi();
						break;
					case 4:
						timKiem();
						break;
					case 5:
						sapXep();
						break;
					case 6:
						System.out.println("Ket THUC CHUONG TRINH ROI NHE!!!");
						return ;
						
				}
		}while(choose != 6);
		
		
	}
	public static void Menu() {
		System.out.println("1. Them moi moi hoc sinh");
		System.out.println("2. Hien thi thong tin của cac hoc sinh");
		System.out.println("3. Hien thi cac hoc sinh 20 tuoi.");
		System.out.println("4. Cho biet cac hoc sinh co tuoi la 23 va que o DN");
		System.out.println("5. Sap xep sinh vien tang dan theo que quan.");
		System.out.println("6. Ket thuc chuong trinh.");
	}
	private static void title() {
		System.out.printf("%-20s %-20s %-20s %-15s %-15s \n","Ho Ten" , "Tuoi" , "Que Quan" , "Ma Lop" , "Ten Lop");
	}
	private static void them() {
		student  newHS = new student();
		newHS.input();
		ListHS.add(newHS);
	}
	
	private static void xuat() {
		if(ListHS.size() > 0) {
			//byte count = 0;
			title();
			for(student hs: ListHS) {
				hs.output();
				//count++;
			}
			//if(count == 0) System.out.println("Khong co");
		}else System.out.println("Chua co hoc sinh nao!");
	}
	
	private static void hs20tuoi() {
		if(ListHS.size() > 0) {
			byte count = 0;
			title();
			for(student hs: ListHS) {
				if(hs.getAge() == 20) {
					hs.output();
					count++;
				}
			}
			if(count == 0) System.out.println("Khong co hoc sinh nao 20 tuoi!");
		}else System.out.println("Chua co hoc sinh nao!");
	}
	private static void timKiem() {
		if(ListHS.size() > 0) {
			byte count = 0;
			title();
			for(student hs: ListHS) {
				if(hs.getAge() == 23 && hs.getAddress().equalsIgnoreCase("DN")) {
					count++;
				}
			}
			if(count == 0) System.out.println("Khong co hoc sinh nao 23 tuoi va o DN!");
			if(count > 0) System.out.println("So hoc sinh co tuoi 23 va o DN la:" + count);
		}else System.out.println("Chua co hoc sinh nao!"); 
	}
	
	private static void sapXep() {
		if(ListHS.size() > 2) {
			byte count = 0;
			title();
			for(int i = 0;i < ListHS.size();i++) {
				for(int j = i + 1;j < ListHS.size();j++) {
					if(ListHS.get(i).getAddress().compareTo(ListHS.get(j).getAddress()) > 0) {
						student item = ListHS.get(i);
						ListHS.set(i,ListHS.get(j));
						ListHS.set(j, item);
					}
				}
			}
			xuat();
		}else System.out.println("Khong the sap xep dc"); 		
	}
}
