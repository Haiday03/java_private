package BTVN;

import java.util.ArrayList;

public class HocSinh extends KhoiThi {
	
	static ArrayList<HocSinh> students = new ArrayList<>();
	
	private String sBD;
	private String ten;
	private String diaChi;
	private int mucUuTien;
	private KhoiThi kt = new KhoiThi();
	
	//KhoiThi kt = new KhoiThi();
	
	public void input() {
		System.out.println("Nhap so bao danh cua hoc sinh");
		setSBD(sc.nextLine());
		
//		sc.nextLine();
		System.out.println("Nhap ho ten hoc sinh:");
		setTen(sc.nextLine());
		
		System.out.println("Nhap dia chi cua hoc sinh:");
		setDiaChi(sc.nextLine());
		
		System.out.println("Nhap muc do uu tien cua hoc sinh:");
		setMucUuTien(sc.nextInt());
		
		kt.nhapMonThi();
		
	}
	public HocSinh() {
	}
	
	public HocSinh(String sBD, String ten, String diaChi, int mucUuTien) {
		super();
		this.sBD = sBD;
		this.ten = ten;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
	}


	public String getSBD() {
		return sBD;
	}
	public void setSBD(String sBD) {
		this.sBD = sBD;
	}
	
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getMucUuTien() {
		return mucUuTien;
	}
	public void setMucUuTien(int mucUuTien) {
		this.mucUuTien = mucUuTien;
	}
	public static void main(String[] args) {
		int choose ;
		do {
			Menu();
			System.out.println("Choose = ");
			choose = sc.nextInt();
			switch(choose) {
			
			case 1:
				them();
				break;
			case 2:
				xuat();
				break;
			case 3:
				timKiemTheoSbd();
				break;
			case 4:
				System.out.println("Dung chuong trinh!!!");
				break;
			}
		}while(choose != 4);
	}
	
	private static void timKiemTheoSbd() {
		// TODO Auto-generated method stub
		String search;
		sc.nextLine();
		System.out.println("Nhap sbd can tim kiem la:");
		search = sc.nextLine();
		
		for(int i = 0;i < students.size();i++){
			if(students.get(i).getSBD().equals(search)) {
				students.get(i).output();
			}
		}
	}

	private static void xuat() {
		// TODO Auto-generated method stub
		if(students.size() <= 0) {
			System.out.println("Chua co sinh vien nao!!!");
		}else {
			title();
			for(HocSinh hs: students) {
				hs.output();
			}		
			System.out.println("\n");
		}

	}

	private static void them() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao thong tin Hoc Sinh:");
		HocSinh newHocSinh = new HocSinh();
		newHocSinh.input();
		students.add(newHocSinh);
	}

	static void Menu() {
		System.out.println("1. Them moi sinh vien");
		System.out.println("2. Hiển thị thông tin của thí sinh và khối thi của thí sinh.");
		System.out.println("3. Tìm kiếm theo số báo danh.");
		System.out.println("4. Thoát khỏi chương trình");
	}
	public static void title() {
		System.out.printf("%-10s %-10s %-15s %-15s %-15s\n","SBD","Ten","DiaChi","MucUuTien","Khoi Thi");
	}
	public void output() {
		System.out.printf("%-10s %-15s %-15s %-15d %-10s\n",getSBD(),getTen(),getDiaChi(),getMucUuTien(),kt.getKt());
	}
	
}
