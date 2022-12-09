package buoi7;

import java.util.Scanner;

public class Student extends Person {
	

	private String masv;
	private String tenLop;
	private int khoaHoc;
	
	public String getMasv() {
		return masv;
	}
	public String getTenLop() {
		return tenLop;
	}
	public int getKhoaHoc() {
		return khoaHoc;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public void setKhoaHoc(int khoaHoc) {
		this.khoaHoc = khoaHoc;
	}

	public Student() {
		
	}
	
	public Student(String name, String diaChi, int tuoi,String masv, String tenLop, int khoaHoc) {
		super(name,diaChi,tuoi);//Goi den contructor mac dinh cua thang cha
		this.masv = masv;
		this.tenLop = tenLop;
		this.khoaHoc = khoaHoc;
	}
	//Ke thua : su dung nhung thuoc tinh va phuong tinh cua tk cha ma class con duoc du dung
	
	public void input() {
		//Supper :Tu Khoa dung de tham chieu den thang cha gan nhat
		//supper. goi den phuong thuc thang cha da dinh nghia san
		super.input();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap masv: ");
		setMasv(sc.nextLine());
		
		System.out.println("Nhap ten lop:");
		setTenLop(sc.nextLine());
		
		System.out.println("Nhap nien khoa :");
		setKhoaHoc(sc.nextInt());
		
		
	}
	public void output() {
		//Su dung keyword nay de truy van den tk cha
		super.output();
		System.out.printf("%-10s %-10s %-10d",getMasv(),getTenLop(),getKhoaHoc());
	}
}
