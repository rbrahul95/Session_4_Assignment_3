

                       //Assignment – Create a encapsulation class for employee details.
class Employee
{
	private int EmpID;
	private String EmpName;

	public Employee() //constructor
	{
		EmpID = 2;
		EmpName = "Acadgild";
                	}
	
	public int getEmpID() 
	{
		return EmpID;
	}
	public int setEmpID(int empID) 
	{
		EmpID = empID;
                return EmpID;
	}
	public String getEmpName() 
	{
		return EmpName;
	}
	public String setEmpName(String empName)
	{
		EmpName = empName;
            return EmpName;
                
                
	}

	}
public class Session_4_Assignment_3 {
    public static void main(String[] args) 
	{
		Employee emp = new Employee();
                //direct calling from constructor using object
		System.out.println("Employee EmpID=" + emp.getEmpID());
                System.out.println("Employee EmpName=" + emp.getEmpName());	
                
                //calling from methods using object
		 System.out.println("Employee EmpID=" + emp.setEmpID(1));
                 System.out.println("Employee EmpName=" + emp.setEmpName("Rahul Bhatia"));
                
	}
}

/*Expected Output :  
Employee EmpID=2
Employee EmpName=Acadgild
Employee EmpID=1
Employee EmpName=Rahul Bhatia
             
 */
