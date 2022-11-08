package BTVN;
import java.util.*;
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int count = 1;
		char[] arrNew ;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		String s = str.toLowerCase();
		arrNew = s.toCharArray();
		for(int i = 0;i < arrNew.length;i++) {
			for(int j = i + 1;j < arrNew.length;j++) {
				if(arrNew[i] == arrNew[j] && arrNew[i] != ' ') {
					count++;
					arrNew[j] = ' ';
				}
			}
			if(arrNew[i] != ' ') System.out.println(arrNew[i] + ": " + count);
			count = 1;
		}
	}

	private static char arrNew(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
