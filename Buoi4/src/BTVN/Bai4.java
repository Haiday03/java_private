package BTVN;

import java.util.Scanner;

public class Bai4 {
	public static void nhap(String a) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1,str2;
		str1 = sc.nextLine();
		str2 = sc.nextLine();

		//Chuyen chuoi thanh mang chuoi cac tu
		String[] Arr = str2.split(" ");
		for(int i = 0;i < Arr.length;i++) {
			for(int j = i + 1;j < Arr.length;j++) {
				if(Arr[i].length() < Arr[j].length()) {
					String tmp = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = tmp;
				}
			}
		}
		for(int i = 0;i < Arr.length;i++) {
			if(str1.contains(Arr[i])) {
				System.out.println(Arr[i].length());
				return ;
			}
		}
		System.out.println("0");
	}

}
