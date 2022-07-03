package department;

public class SuperDepartment //Super class
{

	public String departmentName() { return "Welcom to Super Department"; }
	public String getTodaysWork() { return "No Work as of now";}
	public String getWorkDeadLine() { return "Nil"; }
	public String isTodayAHoliday() { return "Today is not a holiday"; }
		
}

class AdminDepartment extends SuperDepartment //sub class
{
	public String departmentName() { return "Welcome to Admin Department"; } //method overriding 
	public String getTodaysWork() { return "Complete your documents Submission";} // method overriding
	public String getWorkDeadLine() { return "Compelete by EOD"; } // method overriding
   
	
}

class HrDepartment extends SuperDepartment //sub class
{
    public String departmentName() { return "Welcome Hr Department"; } // method overriding
	public String getTodaysWork() { return "Fill today's worksheet and mark your attendance ";} // method overriding
	public String getWorkDeadLine() { return "Compelete by EOD"; } // method overriding
	public String doActivity() { return "team Lunch"; }
}

class TechDepartment extends SuperDepartment //sub class
{
    public String departmentName() { return "Welcome to Tech Department"; } // method overriding
	public String getTodaysWork() { return "Complete coding of module 1 ";} //  method overriding
	public String getWorkDeadLine() { return "Compelete by EOD"; } //  method overriding
	public String getTechStackInformation() { return "core Java"; }
}
