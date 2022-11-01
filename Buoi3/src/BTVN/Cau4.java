package BTVN;

import java.util.Scanner;

public class Cau4 {
	public static Boolean ktSnt(int a) {
		if(a < 2) return false;
		else {
			for(int i = 2;i <= Math.sqrt(a);i++) {
				if(a % i == 0) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int count = 0,c,older = 0,dem = 0,o = 0;
			
			int[] b = new int[n];
			
			for(int i = 0;i < n;i++) {
				b[i] = sc.nextInt();
			}
			for(int i = 0;i < n;i++) {
				if(ktSnt(b[i])) {
					older = b[i];
					while(b[i] / 10 != 0 || b[i] > 0) {
						c = b[i] % 10;
						b[i] = b[i] / 10;
						if(ktSnt(c)) count++;
						dem++;
					}
					if(dem == count) {
						System.out.print(older + " ");
						o++;
					}
					dem = 0;
					count = 0;
				}
			}
			if(o == 0) {
				System.out.println("NO");
			}
	}

}
