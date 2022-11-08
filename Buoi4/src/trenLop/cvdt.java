package trenLop;

import java.util.Scanner;

public class cvdt {

	public static float cV(float a) {
		return 2*a;
	}
	public static float dT(float b) {
		return (float) (2*Math.PI*Math.pow(b, 2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float r,p,s;
		
		Scanner sc = new Scanner(System.in);
		r = sc.nextFloat();
		p = cV(r);
		s = dT(r);
		
		System.out.println("Chu vi va dien tich cua hinh tron lan luot la:" + p + " va " + s);
	}
	

}
