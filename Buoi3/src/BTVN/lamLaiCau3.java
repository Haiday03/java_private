package BTVN;

import java.util.Scanner;

public class lamLaiCau3 {
	   public static void main (String[] args) {
	        Scanner sc = new Scanner (System.in);
	        int dem = 1,max = 1;
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();
	        for (int i = 0; i < n-1; i++ )
	        {
	                if (arr[i] <= arr[i+1])
	                    dem++;
	                else    dem = 1;              
	            if(max < dem) max = dem;
	        }

	        System.out.print (max);
	        
	    }
}