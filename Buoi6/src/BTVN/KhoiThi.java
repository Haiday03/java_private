package BTVN;

import java.util.Scanner;

public class KhoiThi {
	
	static Scanner sc = new Scanner(System.in);
	
	private String mon1;
	private String mon2;
	private String mon3;
	private String kt;
	
	public void nhapMonThi() {
		sc.nextLine();
		System.out.println("Mon 1 la:");
		setMon1(sc.nextLine());
		
		System.out.println("Mon 2 la:");
		setMon2(sc.nextLine());
		
		System.out.println("Mon 3 la:");
		setMon3(sc.nextLine());
		
		setKt(getMon1(),getMon2(),getMon3());
		
	}
	public KhoiThi() {
		
	}
	public KhoiThi(String mon1, String mon2, String mon3) {
		this.mon1 = mon1;
		this.mon2 = mon2;
		this.mon3 = mon3;
	}
	
	public String getMon1() {
		return mon1;
	}

	public String getMon2() {
		return mon2;
	}

	public String getMon3() {
		return mon3;
	}
	public String getKt() {
		
		return kt;
	}

	public void setMon1(String mon1) {
		this.mon1 = mon1;
	}

	public void setMon2(String mon2) {
		this.mon2 = mon2;
	}

	public void setMon3(String mon3) {
		this.mon3 = mon3;
	}
	public void setKt(String mon1,String mon2,String mon3) {
		if(getMon1().equalsIgnoreCase("Van") && getMon2().equalsIgnoreCase("Su") && getMon3().equalsIgnoreCase("Dia")) {
			this.kt = "C";
		}else if(getMon1().equalsIgnoreCase("Toan") && getMon2().equalsIgnoreCase("Ly") && getMon3().equalsIgnoreCase("Hoa"))
			this.kt = "A";
		else this.kt = "B";
	}



	
}
