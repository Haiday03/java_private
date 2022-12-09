package buoi7;

import java.util.ArrayList;

public class test {
	Student student = new Student();
	
	public static void main(String[] args) {
		Student student = new Student();
		student.input();
		student.output();
		
		//Ke thua thu bac
		System.out.println("\n");
		Con1 con = new Con1();
		con.lapTrinh();
		con.choiCo();
		con.hutThuocLao();
	
		//Phuo g thuc cua ong
		
		Cha cha = new Cha();
		cha.choiCo();
		cha.hutThuocLao();
		
		//Ke thua theo thu bac
		Dog dog = new Dog();
		dog.coiNha();
		dog.an();
		
		Cat cat =  new Cat();
		cat.an();
		cat.batChuot();
		
		Employee employee1 = new Employee();
		employee1.input();
		
		Employee employee2 = new Employee();
		employee2.input();
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		
		EmployeeService employeeService = new EmployeeService();
		
		employeeService.sortByName(employees);
		employeeService.output(employees);
		//implements la trien khai ra
		//con extends la ke thua lai
	}
}
