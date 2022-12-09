package buoi7;

import java.util.ArrayList;

public class EmployeeService  implements sort{
	//Chuyen su lai cac cai logic chuc nang doi tuong

	@Override
	public void sortByName(ArrayList<Employee> employees) {
		for(int i = 0;i < employees.size() - 1;i++) {
			for(int j = i;j < employees.size();j++) {
				if(employees.get(i).getName().compareTo(employees.get(j).getName()) > 0) {
					Employee temp =  employees.get(i);
					employees.set(i, employees.get(j));
					employees.set(j, temp);
				}
			}
		}
	}
	
	public void output(ArrayList<Employee> employees) {
		for(Employee epl: employees) epl.output();
	}
}
