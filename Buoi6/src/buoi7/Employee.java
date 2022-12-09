package buoi7;

import java.util.ArrayList;

public class Employee extends Person{
	private String manv;
	
	private String tenCty;
	
	//Khi ma minh muon dinh Nghia lai tk con thi minh se cho keyword
	//O tren phuong thuc cua tk con
	@Override
	public void thucDay() {
		//super.thucDay();
		System.out.println("Thuc day luc 6h sang");
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.thucDay();
		
		Employee employee = new Employee();
		employee.thucDay();
	}

}
