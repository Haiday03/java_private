package BTVN;

import java.util.Scanner;

public class Cau_1 {
	public static void inArr(int a,int[] b) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap cac phan tu cua mang:");
		for(int i = 0;i < b.length;i++) {
			b[i] = sc.nextInt();
		}
	}
	public static void check(int m,int[] c) {
		int dem = 1;
		for(int i = 0;i < c.length;i++) {
			for(int j = i + 1;j < c.length;j++) {
				if(c[i] == c[j]) {
					dem++;
					c[j] = ' ';
				}
			}
			if(c[i] != ' ') System.out.println(c[i] + ":" + dem);

			dem = 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap n>=2 la:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		inArr(n,arr);
		check(n,arr);
	}

}
