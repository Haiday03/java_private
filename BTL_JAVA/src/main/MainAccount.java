package main;

import dao.AccountDao;
import model.Account;

import java.util.List;
import java.util.Scanner;

import dao.RestaurantDAO;

public class MainAccount {
	//Get List Account 
	public static List<Account> listTk() {
		AccountDao accountDao = new AccountDao();
		return accountDao.getAccount();
	}
	
	public static void forgotPassword() {
		System.out.println("Enter username : ");
		String username = new Scanner(System.in).next();
		if(username != null) {
			System.out.println("Enter password want to change : ");
			String password = new Scanner(System.in).next();
			AccountDao accountDao = new AccountDao();
			accountDao.updatePassword(username, password);
			System.out.println("Update password success!");
		}else {
			System.out.println("Username is not exits!");
		}
	}
}
