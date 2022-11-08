package BTVN;

import java.util.*;  

public class Bai2 {
//	public static String nhapString(String str) {
//		Scanner sc = new Scanner(System.in);
//		str = sc.nextLine();
//		return str;
//	}
//	public static Boolean kt(String std) {
//		for(int i = 0;i < std.length();i++) {
//			if(std.charAt(i) < '0' && std.charAt(i) > '9') {
//				return false;
//			}
//		}
//		return true;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          String str;
          str = sc.nextLine();
          int sum = 0,dem = 0;
          float tbc;
          //nhapString(str);
          //if(kt(str)) {
        	  //System.out.println("True");
      		for(int i = 0;i < str.length();i++) {
    			if(str.charAt(i) >= 49 && str.charAt(i) <= 59) {
    				sum += str.charAt(i) - 48;
    				dem++; 
    			}
    			
    		}
      		if(dem > 0) {
      			System.out.println("true");
      			tbc = (float)sum/dem;
      			System.out.println(Math.round(tbc*1000.0)/1000.0);
      		}else {
        	  System.out.println("false");
          }
	}
	private static boolean isNaN(char c) {
		// TODO Auto-generated method stub
		return false;
	}

}
