package Bai1;

import java.util.Scanner;

public class Bai1 {
	static Scanner sc = new Scanner(System.in);
			
	public static void main(String[] args) {
		String str;
		int a = 0,b = 0;
		str = sc.nextLine();
		
		for(int i = 0;i < str.length();i++) {
			if(str.charAt(i) == '(') {
				a++;
			}
			if(str.charAt(i) == ')') {
				b++;
			}
		}
		System.out.println(a - b);
	}
}
