package main;

import dao.AccountDao;
import dao.RestaurantDAO;
import model.Account;
import model.Restaurant;
import services.AccountService;
import services.AccountServiceImp;
import services.RestaurantServiceImp;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dao.RestaurantDAO;
import static main.MainAccount.listTk;

public class MainRestaurant {
	
	static Scanner sc = new Scanner(System.in);
	
	static void logIn() throws SQLException {
		
	    String username_regex = "^[\\w+]{6,}$";
	    Pattern pattern;
	    Matcher matcher;
	    String username;
	    do {
	      System.out.println(" Enter your username : ");
	      username = sc.nextLine();
	      pattern = Pattern.compile(username_regex);
	      matcher = pattern.matcher(username);
	      if (matcher.find()) break;
	      else System.out.println(" Username is not format");
	    } while (!matcher.find());

	    System.out.println(" Enter your password : ");
	    String password = sc.nextLine();
	    boolean check = false;
	    for (Account tk : listTk()) {
	      //Login and manage function
	      if (tk.getUsername().equals(username) && tk.getPassword().equals(password)) {
	        System.out.println(" Welcome Admin , invite you perform the function");
	        int choseAdmin;
	        do {
	          System.out.println(" ADMIN FUNCTION MANAGEMENT MENU ");
	          System.out.println("1.Find restaurant by restaurantId");
	          System.out.println("2.Find restaurant by name");
	          System.out.println("3.Delete restaurant by id");
	          System.out.println("4.Show list student");
	          System.out.println("5.Manage salary by month ");
	          System.out.println("6.Add restaurant");
	          System.out.println("7.Edit restaurant information");
	          System.out.println("8.Delete restaurant by name");
	          System.out.println("9.Exit");
	          System.out.println(" Enter your chose :  ");
	          choseAdmin = sc.nextInt();
	          sc.nextLine();
	          switch (choseAdmin) {
	            case 1: {
	            	findRestaurantById();
	              break;
	            }
	            case 2: {
	              findRestaurantByName();
	              break;
	            }
	            case 3: {
	            	deleteRestaurantById();
	              break;
	            }
	            case 4: {
	            	printListRestaurant();
	              break;
	            }
	            case 5 : {
	            	manageSalary();
	            	break;
	            }
	            case 6 : {
	            	inputInfoRestaurant();
	            	break;
	            }
	            case 7 : {
	            	editInfoRestaurant();
	            	break;
	            }
	            case 8 : {
	            	deleteRestaurantByName();
	            	break;
	            }

	          }
	        } while (choseAdmin != 9);
	        check = true;
	        break;
	      }
	    }
//	      if (tk.getRole().equals("user") && tk.getUsername().equals(username) && tk.getPassword().equals(password)) {
//	        System.out.println(" Hello " + getName(username) + ", invite you to perform the function ");
//	        int choseUs;
//	        do {
//	        	for
//	          System.out.println("MENU MANAGE INFORMATION OF RESTAURANT ");
//	       //   System.out.println("1.Enter information for restaurant ");
//	          System.out.println("1.Edit your information ");
//	          System.out.println("2.Logout ");
//	          System.out.print(" Enter your chose :  ");
//	          choseUs = sc.nextInt();
//	          sc.nextLine();
//	          switch (choseUs) {
////	            case 1: {
////	            	inputInfoRestaurant(username);
////	              break;
////	            }
//	            case 1 : {
//	            	editInfoRestaurant(username);
//	            	break;
//	            }
//	          }
//	        } while (choseUs != 2);
//	        check = true;
//	        break;
//	      }
//	    }
//	    if (!check) {
//	      System.out.println("Account is not valid!");
//	    }
	}
	
	  public static void register() throws SQLException {
		    //Enter information for student
//		    RestaurantServiceImp stImp = new RestaurantServiceImp();
//		    RestaurantDAO svd = new RestaurantDAO();
//		    Restaurant st = new Restaurant();
//		    stImp.input(st);

		    AccountService accSv = new AccountServiceImp();
		    AccountDao accDAO = new AccountDao();
		    Account acc = new Account();
		    accSv.input(acc);
		    accDAO.add(acc);

		    //Enter information for account
//		    st.setUsername(acc.getUsername());
//		    svd.add(st, st.getUsername());
//		    System.out.println("Create account success!");
		  }

	private static void findRestaurantByName() {
		// TODO Auto-generated method stub
		RestaurantDAO restaurantDAO = new RestaurantDAO();
		System.out.println("Enter name you will find : ");
		String ten = sc.nextLine();
		
		try {
			Restaurant nh = restaurantDAO.findByName(ten);
			if(nh != null) {
				System.out.printf("%-10s %-10s %-10s %-10s %-10s\n","Name","ID","Phone number","thu nhap tt","thu nhap tn");

					System.out.printf("%-10s %-10s %-10d %-10d %-10d",nh.getName(),nh.getRestaurantId(),nh.getPhoneNumber(),nh.gettNTT(),nh.gettNTN());
			}else {
				System.out.println("Not found restaurant with name : " + ten);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void findRestaurantById() {
		// TODO Auto-generated method stub
		RestaurantDAO restaurantDAO = new RestaurantDAO();
		System.out.println("Enter restaurantId you want find : ");
		String ID = sc.nextLine();
		
		try {
			Restaurant nh = restaurantDAO.find(ID);
			
			if(nh != null) {
				System.out.printf("%-10s %-10s %-10s %-10s %-10s\n","Name","ID","Phone number","thu nhap tt","thu nhap tn");
				
					System.out.printf("%-10s %-10s %-10d %-10d %-10d\n",nh.getName(),nh.getRestaurantId(),nh.getPhoneNumber(),nh.gettNTT(),nh.gettNTN());
			
			}else {
				System.out.println("Not found restaurant with id : " + ID);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void deleteRestaurantById() throws SQLException {
		RestaurantDAO restaurantDAO = new RestaurantDAO();
		System.out.println("Enter restaurantId you will remove :");
		//remove restaurant
		String restaurantId = sc.nextLine();
		Restaurant restaurant = restaurantDAO.find(restaurantId);
		if(restaurant != null) {
			restaurantDAO.deleteById(restaurantId);
			//Remove Account
			AccountDao accountDAO = new AccountDao();
			accountDAO.deleteAccount(restaurantId);
			System.out.println("Remove this restaurant has restaurantId :" + restaurantId + " success!");
		}else {
			System.out.println("Not found restaurant with id : " + restaurantId);
		}
	}
	private static void deleteRestaurantByName() throws SQLException {
		RestaurantDAO restaurantDAO = new RestaurantDAO();
		System.out.println("Enter name you will remove :");
		//remove restaurant
		String name = sc.nextLine();
		Restaurant restaurant = restaurantDAO.findByName(name);
		if(restaurant != null) {
			restaurantDAO.deleteByName(name);
			//Remove Account
			AccountDao accountDAO = new AccountDao();
			accountDAO.deleteAccount(name);
			System.out.println("Remove this restaurant has name :" + name + " success!");
		}else {
			System.out.println("Not found restaurant with id : " + name);
		}
	}
	
	public static void printListRestaurant() {
		RestaurantDAO restaurantDAO = new RestaurantDAO();
		try {
			List<Restaurant> restaurants = restaurantDAO.findAll();
			System.out.println("List of restaurant !");
			System.out.printf("%-10s %-10s %-10s %-10s %-10s\n","Name","ID","Phone number","thu nhap tt","thu nhap tn");
			for ( Restaurant nh : restaurants) {
				System.out.printf("%-10s %-10s %-10d %-10d %-10d \n",nh.getName(),nh.getRestaurantId(),nh.getPhoneNumber(),nh.gettNTT(),nh.gettNTN());
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void editInfoRestaurant() throws SQLException {
		Scanner sc = new Scanner(System.in);
		RestaurantDAO restaurantDAO = new RestaurantDAO();
		Restaurant restaurant = new Restaurant();
//		System.out.println("Enter name :");
//		restaurant.setName(sc.nextLine());
//		
//		System.out.println("Enter phone :");
//		restaurant.setPhoneNumber(sc.nextInt());
//		
//		System.out.println("Enter tNTT :");
//		restaurant.settNTT(sc.nextInt());
//		
//		System.out.println("Enter tNTN :");
//		restaurant.settNTN(sc.nextInt());
		String id;
		System.out.println("Enter id need edit:");
		id = sc.nextLine();
		for(Restaurant nh : restaurantDAO.findAll()) {
			if(nh.getRestaurantId().equals(id)) {
				System.out.println("Enter name :");
				String name = sc.nextLine();
				
				System.out.println("Enter phone :");
				int phonenumber = sc.nextInt();
				
				restaurantDAO.update(id, name, phonenumber);
				
			}
		}
		System.out.println("Edit information success!!!");
		
	}
	
	public static void inputInfoRestaurant() throws SQLException{
		Restaurant nh = new Restaurant();
		RestaurantDAO restaurantDAO = new RestaurantDAO();
		
		//sc.nextLine();
		System.out.println("Enter restaurantId : ");
		nh.setRestaurantId(sc.nextLine());
		
		System.out.println("Enter name : ");
		nh.setName(sc.nextLine());
		
		System.out.println("Enter phone number : ");
		nh.setPhoneNumber(sc.nextInt());
		
		System.out.println(":Enter thu nhap thang trc:");
		nh.settNTT(sc.nextInt());
		
		System.out.println("Enter thu nhap thang nay :");
		nh.settNTN(sc.nextInt());
		
		restaurantDAO.add(nh);
	}
	
	public static void manageSalary() throws SQLException {
		//xem la thu nhap thang nay so voi thang truoc la lai bao nhieu hoac lo bao nhieu
		RestaurantDAO restaurantDAO = new RestaurantDAO();
		List<Restaurant> restaurants = restaurantDAO.findAll();

		int luongThangTrc = 0,luongThangNay = 0;
		for ( Restaurant nh : restaurants) {
			luongThangTrc += nh.gettNTT();
			luongThangNay += nh.gettNTN();
		}
		
		if(luongThangTrc > luongThangNay) {
			int tong = luongThangTrc - luongThangNay;
			System.out.println("Thang nay lai it hon thang truoc :" + tong);
		}else {
			int tong = luongThangNay - luongThangTrc;
			System.out.println("Thang nay lai nhieu hon thang truoc :" + tong);
			
		}
	}
}
