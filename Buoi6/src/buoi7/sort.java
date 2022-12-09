package buoi7;

import java.util.ArrayList;

public interface sort {
	//Interface : minh se co tinh chat da ke thua 
	void sortByName(ArrayList<Employee> employees ) ;
//	public void sortByAddress();
//	public abstract void sortByAge();// mac dinh day
	
	//asbtract :truu tuoong minh chi can tao ra ten ham no lam gi
	//va k can quan tam no su ly nhu the nao
	public static final float PI = 3.14f;
	//O trong interface minh chi dc khai bao 2 cai
	    //1 Minh Khai Bao method ma minh muon class khac no ke thua
	   //2 .Minh se khai bao dc cac hang so 
	//Mac dinh la public abstract
	
	//asbtract :truu tuong minh chi can tao ra ten ham va minh k can
	//quan tam den den cach no xu ly nhu the nao
}
