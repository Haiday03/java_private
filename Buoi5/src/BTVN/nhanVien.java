package BTVN;

import java.util.Scanner;

public class nhanVien {

	static int tmp = 1;
	
	private int id;
	private String name;
	private int eplt;//Kiểu nhân viên
	private int soNgayLam;
	private int namVaoLam;
	
	private static Scanner sc = new Scanner(System.in);
	
	public nhanVien() {
		this.id = tmp++;
	}
	
	public nhanVien(String name,int eplt,int soNgayLam,int namVaoLam) {
		this.id = tmp++;
		this.name = name;
		this.eplt = eplt;
		this.soNgayLam = soNgayLam;
		this.namVaoLam = namVaoLam;
	}
	
	public void Info() {
		sc.nextLine();
		System.out.println("Nhap ten :");
		setName(sc.nextLine());
		
		System.out.println("Nhap kieu nhan vien 1. là sản xuất và 2. là nhân viên");
		setEplt(sc.nextInt());
		
		System.out.println("Nhap so ngay lam:");
		setSoNgayLam(sc.nextInt());
		
		System.out.println("Nhap so nam vao lam la:");
		setNamVaoLam(sc.nextInt());
		
	}
	
	public long luong() {
		long LNV = 0;
		if(this.eplt == 1) {
			LNV = (long)this.soNgayLam * 350;
			
		}else {
			LNV = (long)this.soNgayLam*400;
		}
		return LNV;
	}
	public long phuCap() {
		long pc = 100;
		if(this.namVaoLam < 2022)
		pc = pc + (long)(2022 - this.namVaoLam)*200;
		
		return pc;
	}
	
	public long sumMoney() {
		return luong() + phuCap();
	}
	public String xxx() {
		String knv;
		if(getEplt() == 1) {
			 knv = "Sản Xuất";
		}else {
			 knv = "Văn Phòng";
		}
		return knv;
	}
	public void outInfo() {

		System.out.printf("%-10d %-10s %-10s %-15d %-15d %-10d %-10d %-10d \n",getId(),getName(),xxx(),getSoNgayLam(),getNamVaoLam(),luong(),phuCap(),sumMoney());
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEplt() {
		return eplt;
	}

	public void setEplt(int eplt) {
		this.eplt = eplt;
	}

	public int getSoNgayLam() {
		return soNgayLam;
	}

	public void setSoNgayLam(int soNgayLam) {
		this.soNgayLam = soNgayLam;
	}

	public int getNamVaoLam() {
		return namVaoLam;
	}

	public void setNamVaoLam(int namVaoLam) {
		this.namVaoLam = namVaoLam;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Nhập số nhân viên :");
		n = sc.nextInt();
		
		nhanVien[] nv = new nhanVien[n];
		
		for(int i = 0;i < n;i++) {
			nv[i] = new nhanVien();
			nv[i].Info();
		}
		System.out.printf("%-10s %-10s %-10s %-15s %-15s %-10s %-10s %-10s\n", "ID", "Name", "Elpt", "So ngay lam", "Nam vao lam", "Luong", "Phụ Cấp","Tổng tiền");
		for(int i = 0;i < n;i++) {
			nv[i].outInfo();
		}
	}

}
