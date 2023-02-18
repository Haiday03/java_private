package services;

import java.util.Scanner;

import model.Restaurant;

public class RestaurantServiceImp implements RestaurantService {

	@Override
	public void input(Restaurant nh) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter restaurant information!");
		System.out.println("Restaurant name:");
		nh.setName(sc.nextLine());
		
		System.out.println("Restaurant id:");
		nh.setRestaurantId(sc.nextLine());
		
		System.out.println("Restaurant phone number:");
		nh.setPhoneNumber(sc.nextInt());
		
		System.out.println("Restaurant tntt:");
		nh.settNTT(sc.nextInt());
		
		System.out.println("Restaurant tntn:");
		nh.settNTN(sc.nextInt());
		
		
	}

	@Override
	public void output(Restaurant nh) {
		// TODO Auto-generated method stub
	    System.out.printf("%-10s %-10s %-10d %-10d %10d\n",nh.getName(),nh.getRestaurantId(),nh.getPhoneNumber(),nh.gettNTT(),nh.gettNTN());
	}
	
}
