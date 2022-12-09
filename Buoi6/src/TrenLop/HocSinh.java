package TrenLop;

import java.util.Scanner;

public class HocSinh {
	private String msv;
	
	private String tenSV;
	
	private int tuoi;
	
	private LopHoc lopHoc = new LopHoc();//Quan he has-a
	
	public HocSinh() {}
	
	public HocSinh(String msv,String tenSV,int tuoi , LopHoc lophoc) {
		this.msv = msv;
		this.tenSV = tenSV;
		this.tuoi = tuoi;
		this.lopHoc = new LopHoc();
	}
	
	public HocSinh(String msv,String tenSV,int tuoi) {
		this.msv = msv;
		this.tenSV = tenSV;
		this.tuoi = tuoi;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma sv:");
		setMsv(sc.nextLine());
		
		System.out.println("Nhap vao ten sv:");
		setTenSV(sc.nextLine());
		
		System.out.println("Nhap vao tuoi cua sinh vien:");
		setTuoi(sc.nextInt());
		
		//Goi den ham input cua doi tuong loop hoc
		lopHoc.input();
		
	}

	public void output() {
		System.out.println("Mav :" + getMsv());
		System.out.println("Tensv :" + getTenSV());
		System.out.println("Tuoi:" + getTuoi());
		//Goi den ham output cua doiu tuong lop hoc
		lopHoc.output();
	}
	public String getMsv() {
		return msv;
	}

	public void setMsv(String msv) {
		this.msv = msv;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public LopHoc getLopHoc() {
		return lopHoc;
	}

	public void setLopHoc(LopHoc lopHoc) {
		this.lopHoc = lopHoc;
	}
	
}
