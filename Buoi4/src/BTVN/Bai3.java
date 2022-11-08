package BTVN;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			String str,str1 ;
			str1 = sc.nextLine();
			str = str1.toLowerCase();
		char[] Arr = str.toCharArray();
		int m = 0;
		char[] Arr1 = new char[Arr.length];
		for(int i = 0;i < Arr.length;i++) {
			if(Arr[i] > 48 && Arr[i] < 60) {
				Arr[i] = '*';
			}
		} 
		for(int i = 0;i < Arr.length;i++) {
			if(Arr[i] != '*') {
				Arr1[m] = Arr[i];
				m++;
			}
		}
		String str3 = new String(Arr1);
		String[] Arr2 = str3.split(" ");
		String[] Arr3 = new String[Arr2.length];
		int k = 0;
		for(int i = 0;i < Arr2.length;i++) {
			if(Arr2[i] != "") {
				Arr3[k] = Arr2[i];
				k++;
			}
		}
		for(int i = 0;i < Arr3.length;i++) {
			System.out.print(Character.toUpperCase(Arr3[i].charAt(0)));
			if(Arr3[i].length() > 1) {
				System.out.print( Arr3[i].substring(1));
			}
			if(Arr3[i + 1] != "") {
				System.out.print(" ");
			}
		}
	}

}
