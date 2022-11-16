package bai_tre_lOP;

import java.util.Scanner;

public class Animal {
	//Thuoc tinh
	// đặc điểm chung của đối tượng example :name,giới tính,color
	private String ten;
	private String gioiTinh;
	private String mauSac;
	private static Scanner sc = new Scanner(System.in);
	//Nhung method 
	public void eat() {
		System.out.println("Eating");
	}
	public void dichoi() {
		System.out.println("going hangout");
	}
	//Hàm nhập
	public void input() {
		System.out.println("Nhâp tên của con vật đó: ");
		ten = sc.nextLine();
		
		System.out.println("Nhập giới tính là:");
		gioiTinh = sc.nextLine();
		
		System.out.println("Nhập màu sắc của con vật đó là:");
		mauSac = sc.nextLine();
	}
	//Hàm hiển thị là:
	public void output() {
		
		System.out.println("Tên :" + ten);
		System.out.println("Giới tính: " + gioiTinh);
		System.out.println("Màu Sắc :" + mauSac);
	
	}
	//Contructor,Etter,Setter
	//Contucstor dung de khoi tao cho gia tri k doi
	//Contructor khong doi: khởi tạo các giá trị về mặc định
	public Animal() {
	};
	public Animal(String tenn,String gioiTinhh) {
		ten = tenn;
		gioiTinh = gioiTinhh;
	}
	public Animal(String tenn,String gioiTinhh,String mauSacc) {
		ten = tenn;
		gioiTinh = gioiTinhh;
		mauSac = mauSacc;
	}
	//setter getter
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinhh) {
		gioiTinh = gioiTinhh;
	}
	public String getTen(){
		return ten;
	}
	public void setTen(String tenn) {
		ten = tenn;;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSacc) {
		mauSac = mauSacc;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
		//dog.dichoi();
		
		//Animal cat = new Animal();
		//cat.eat();
		//Lay gia tri 
		//System.out.println();
		dog.input();
		dog.output();
		
	//	System.out.println("Nhắc lại tên con vật đó là:" + dog.getTen());
		//Cách gán trực tiếp
		Animal bird = new Animal("Chim A" , "Duc" );
	    bird.output();
	}

}
