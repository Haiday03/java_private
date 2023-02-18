package services;

import java.util.Scanner;

import model.Account;

public class AccountServiceImp implements AccountService{

	@Override
	public void input(Account tk) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account!");
		System.out.println("Username:");
		tk.setUsername(sc.nextLine());
		
		System.out.println("Password:");
		tk.setPassword(sc.nextLine());
		
		tk.setRole("user");
		
	}

	@Override
	public void output(Account tk) {
		// TODO Auto-generated method stub
	    System.out.printf("%-10s %-10s\n", tk.getUsername(), tk.getPassword());		
	}
	
	
	
}
