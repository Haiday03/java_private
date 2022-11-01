package BTVN;

import java.util.Scanner;

public class Cau2 {
	public static void inArr(int a,int[] b) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap cac phan tu cua mang:");
		for(int i = 0;i < b.length;i++) {
			b[i] = sc.nextInt();
		}
	}
	public static void check(int[] d) {
		int i = d[0],dem = 0;
		for(int j = 0;j < d.length;j++) {
			while(d[j] != i) {
				dem++;
				System.out.print(i + " ");
				i++;
			}
			i++;
			
		}
		if(dem == 0) System.out.print("YES");
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

}
