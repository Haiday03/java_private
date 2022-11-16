package BTVN;

import java.util.Scanner;

public class Oto {
	//Khai báo đối scanner có từ khóa static để nhập cho toàn bộ chương trình
	private static Scanner sc = new Scanner(System.in);
	//Các thuộc tính của lớp ô tô 
	private String chuSoHuu;
	private String nameOto;
	private String brandOto;
	private long priceOto;
	private long yearBought;
	
	public double valueNow() {
		double price;
		if(this.priceOto < 1000) {
			price = (this.priceOto - (this.priceOto*0.07*(2022 - this.yearBought)));
		}else if(this.priceOto >= 1000  && this.priceOto <= 2000) {
			price = (this.priceOto - (this.priceOto*0.05*(2022 - this.yearBought)));
		}else 			
			price = (this.priceOto - (this.priceOto*0.03*(2022 - this.yearBought)));

		return price;
	}
	public Oto() {
		
	}
	public void Info() {
		sc.nextLine();
		System.out.println("Nhập tên chủ sở hữu:");
		setChuSoHuu(sc.nextLine());
		
		System.out.println("Nhập tên xe:");
		setNameOto(sc.nextLine());
		
		System.out.println("Nhập hãng xe:");
		setBrandOto(sc.nextLine());
		
		System.out.println("Nhập giá mua:");
		setPriceOto(sc.nextLong());
		
		System.out.println("Nhập năm mua:");
		setYearBought(sc.nextLong());
	}
	
	public void Outfo() {
		System.out.printf("%-10s %-15s %-10s %-10d %-10d %-10f \n" ,getChuSoHuu(),getNameOto(),getBrandOto(),getPriceOto(),getYearBought(),valueNow());
	}

	public String getChuSoHuu() {
		return chuSoHuu;
	}
	public void setChuSoHuu(String chuSoHuu) {
		this.chuSoHuu = chuSoHuu;
	}
	public String getNameOto() {
		return nameOto;
	}
	public void setNameOto(String nameOto) {
		this.nameOto = nameOto;
	}
	public String getBrandOto() {
		return brandOto;
	}
	public void setBrandOto(String brandOto) {
		this.brandOto = brandOto;
	}
	public long getPriceOto() {
		return priceOto;
	}
	public void setPriceOto(long priceOto) {
		this.priceOto = priceOto;
	}
	public long getYearBought() {
		return yearBought;
	}
	public void setYearBought(long yearBought) {
		this.yearBought = yearBought;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Nhập vào số ô tô cân lư thông tin là:");
		n = sc.nextInt();
		
		Oto[]  car = new Oto[n];
		for(int i = 0;i < n;i++) {
			car[i] = new Oto();
			car[i].Info();
		}
		System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s \n","Chủ sở hữu","Tên xe","Hãng","Giá","Năm sử dụng","Giá trị hiên tại");

		for(int i = 0;i < n;i++) {
			car[i].Outfo();
		}
		
	}

}
