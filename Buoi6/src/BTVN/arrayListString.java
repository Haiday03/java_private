package BTVN;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListString {
	
	static ArrayList<String> ten = new ArrayList<>();
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		System.out.println("Nhap so chuoi ten can nhap la:");
		n = sc.nextInt();
		String chuoi,search;
		sc.nextLine();
		for(int i = 0;i < n;i++) {
			//System.out.println("Ten " + i);
			//sc.nextLine();
			ten.add(chuoi = sc.nextLine());
			//sc.nextLine();
		}
		//for(int i = 0;i < n;i++) {
		//	System.out.println("Ten " + i);
		//	System.out.println(ten.get(i));
		//}
		
		System.out.println("Nhap chuoi con can tim chuoi bo la:");
		search = sc.nextLine();
		
		for(int i = 0;i < n;i++) {
			if(ten.get(i).indexOf(search) >= 0) {
				System.out.println(ten.get(i));
			}
		}
	}
}
