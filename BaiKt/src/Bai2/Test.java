package Bai2;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	static ArrayList<Honey> honeys = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		do {
			System.out.println(" 1.Them honey \r\n"
					+ " 2.Hiển thi honey \r\n"
					+ " 3.Xoa honey theo id \r\n"
					+ " 4.Sap xep honey theo ten\r\n"
					+ "6.Ket Thuc Chuong Trinh!!!\r\n");
			System.out.println("Nhap vao lua chon cua ban:");
			int choose = new Scanner(System.in).nextInt();
			//new Scanner(System.in).nextLine();
			
			switch(choose) {
			case 1:
				add();
				break;
			case 2:
				showHoneys();
				break;
			case 3:
				detele();
				break;
			case 4:
				sort();
				break;
			case 6:
				System.out.println("Good bye !!!");
				return;
			}
			
		}while(true);

}

	private static void sort() {
		// TODO Auto-generated method stub
		for(int i = 0;i < honeys.size();i++) {
			for(int j = i + 1;j < honeys.size();j++) {
				if(honeys.get(i).getName().compareTo(honeys.get(j).getName()) > 0) {
					Honey a = honeys.get(i);
					honeys.set(i, honeys.get(j));
					honeys.set(j, a);
				}
			}
		}
	}

	private static void detele() {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Input id need detele:");
		a = sc.nextInt();
		
		for(int i = 0; i < honeys.size();i++) {
			if(honeys.get(i).getId() == a) {
				honeys.remove(i);
			}
		}
	}

	private static void showHoneys() {
		// TODO Auto-generated method stub
		//title();
		for(Honey item:honeys) item.output();
	}

//	private static void //title() {
//		// TODO Auto-generated method stub
//		
//	}

	private static void add() {
		// TODO Auto-generated method stub
		int b = 0;
		Honey a = new Honey();
		a.input();
		for(int i = 0;i < honeys.size();i++) {
			if(honeys.get(i).getId() == a.getId()) {
				b++;
			}
		}
		if(b == 0) honeys.add(a);
	}
	
	
}
