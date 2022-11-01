package BTVN;

import java.util.Scanner;

public class Cau_3 {
	public static void inArr(int a,int[] b) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap cac phan tu cua mang:");
		for(int i = 0;i < b.length;i++) {
			b[i] = sc.nextInt();
		}
	}
	public static void check(int[] c) {
		int mn = 0,dem = 1 ;
		for(int i = 0;i< c.length;i++) {
//			if(c[i] <= c[i + 1] && i + 1 < c.length) {
//				dem++;
//			}else dem = 1;
//			if(mn < dem) mn = dem;
//		}
			
			for(int j = i;j < c.length;j++) {
				if(c[j] <= c[j+1] && j + 1 < c.length) {
					dem++;
				}else // dem = 1;
				if(mn < dem) mn = dem;
				//System.out.println(c[j + 1]);
				}
			}
		System.out.print(mn);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n=");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		inArr(n,arr);
		check(arr);
	}
	// Bai bi lỗi vẫn chưa chạy đc

}