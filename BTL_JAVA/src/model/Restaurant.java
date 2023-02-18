package model;

public class Restaurant {

	private String name;
	
	private String restaurantId;
	
	private int phoneNumber;
	
	private int tNTT; // thu nhap thang truoc
	
	private int tNTN; // thu nhap thang nay
	
//	private String username;
	
	
	public String getName() {
		return name;
	}
	
	public String getRestaurantId() {
		return restaurantId;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public int gettNTT() {
		return tNTT;
	}
	
	public int gettNTN() {
		return tNTN;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void settNTT(int tNTT) {
		this.tNTT = tNTT;
	}
	
	public void settNTN(int tNTN) {
		this.tNTN = tNTN;
	}
	
	
	
	
}
