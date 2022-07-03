package department;

import java.util.Scanner;

public class DerivedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("Please enter the department from the following");
		System.out.println("1. Super");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Tech");
		
		int option=sc.nextInt();
		SuperDepartment department=new SuperDepartment(); //create object
		AdminDepartment admin=new AdminDepartment(); //create object
		HrDepartment hr=new HrDepartment(); //create object
		TechDepartment tech=new TechDepartment(); //create object
		
		switch(option){
		
		case 1:
			System.out.println(department.departmentName());
			System.out.println(department.getTodaysWork());
			System.out.println(department.getWorkDeadLine());
			System.out.println(department.isTodayAHoliday());
		break;
		
		case 2:
			System.out.println(admin.departmentName());
			System.out.println(admin.getTodaysWork());
			System.out.println(admin.getWorkDeadLine());
			System.out.println(admin.isTodayAHoliday());
	     break;
	     
		case 3:
			System.out.println(hr.departmentName());
			System.out.println(hr.getTodaysWork());
			System.out.println(hr.getWorkDeadLine());
			System.out.println(hr.doActivity());
			System.out.println(hr.isTodayAHoliday());
		break;
		
		case 4:
			System.out.println(tech.departmentName());
			System.out.println(tech.getTodaysWork());
			System.out.println(tech.getWorkDeadLine());
			System.out.println(tech.getTechStackInformation());
			System.out.println(tech.isTodayAHoliday());
		break;
		
			default:System.out.println(" Please enter valid option (1 to 4)");
		}
		
		sc.close();		

	}

}
