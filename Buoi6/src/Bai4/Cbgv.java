package Bai4;

public class Cbgv extends Person {

	//properties
	private String maGV;
	private int luongCung;
	private int luongThuong;
	private int luongPhat;
	
	//contructor
	public Cbgv() {
		
	}
	public Cbgv(String name,short age,String address,String maGV,int luongCung,int luongThuong,int luongPhat) {
		super(name,age,address);
		this.maGV = maGV;
		this.luongCung = luongCung;
		this.luongThuong = luongThuong;
		this.luongPhat = luongPhat;
	}
	//setter getter
	public String getMaGV() {
		return maGV;
	}
	public int getLuongCung() {
		return luongCung;
	}
	public int getLuongThuong() {
		return luongThuong;
	}
	public int getLuongPhat() {
		return luongPhat;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public void setLuongCung(int luongCung) {
		this.luongCung = luongCung;
	}
	public void setLuongThuong(int luongThuong) {
		this.luongThuong = luongThuong;
	}
	public void setLuongPhat(int luongPhat) {
		this.luongPhat = luongPhat;
	}
	
	public void input() {
		System.out.println("Nhap ma so giao vien la:");
		setMaGV(sc.nextLine());
		
		System.out.println("Nhap luong cung cua giao vien:");
		setLuongCung(sc.nextInt());
		
		System.out.println("Nhap luong thuong cua giao vien:");
		setLuongThuong(sc.nextInt());
		
		System.out.println("Nhap luong phat cua giao vien:");
		setLuongPhat(sc.nextInt());
		
		super.input();
	}
	
	public int luongThuc() {
		return getLuongCung() + getLuongThuong() - getLuongPhat();
	}
	public void output() {
		System.out.printf("%-15s %-15d %-15d %-15d %-15d",getMaGV(),getLuongCung(),getLuongThuong(),getLuongPhat(),luongThuc());
		super.output();
	}
	
}
