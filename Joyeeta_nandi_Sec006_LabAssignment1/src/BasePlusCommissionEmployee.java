
public class BasePlusCommissionEmployee {

	//instance variables

	private int employeeId;
	private String firstName;
	private String lastName;
	private double baseSalary = 200;
	private double grossSales;
	private double commissionRate = 0.1;

	// Define getters the Employee Id, First Name, Last Name and Base Salary 
	
	public int getEmployeeId() {
	      return employeeId; 
	   }
	
	   public String getFirstName() {
	      return firstName; 
	   } 
	   
	   public String getLastName() {
		      return lastName; 
		   }
	   public double getBaseSalary() {
		      return baseSalary; 
		   }
	   	   
	   
	// Define getters and setters for Gross Sales 
	   
	   public double getGrossSales() {
		      return grossSales; 
		   }	    
	   
	   public void setGrossSales(double grossSales) {
		   if(grossSales<=0)
			   System.out.println("Enter valid Gross sales amount!\n");
		   else
			   this.grossSales = grossSales; 
	   } 
	   
	// Define getters and setters for Commission Rate
	   
	   public double getCommissionRate() {
		      return commissionRate; 
		   }
	   public void setCommissionRate(double commissionRate) {
		   if(commissionRate > .1 && commissionRate < 1)
			   this.commissionRate = commissionRate; 
		   //else
			  // this.commissionRate = 0.1;
		   } 

	   
	 //Constructor with all data members
	   
	   public BasePlusCommissionEmployee(int employeeId, String firstName, String lastName, 
			   double baseSalary, double grossSales, double commissionRate) {
		   
		   if (employeeId > 0) {
			   this.employeeId = employeeId; // assign employeeId to instance variable employeeId
		   }
		   else
		   {
			   System.out.println("Enter valid Employee Id!\n");
		   }
		   
		   if (firstName != "")
		   {
		      this.firstName = firstName;
		   }
		   else
		   {
			   System.out.println("Enter First Name!\n");
		   }
		   
		   if (lastName != "")
		   {
		      this.lastName = lastName;
		   }
		   else
		   {
			   System.out.printf("Enter Last Name");
		   }
		   
		   if (baseSalary > 200)
		   {
		      this.baseSalary = baseSalary;
		   }
		   		   
		   setGrossSales(grossSales);
		   setCommissionRate(commissionRate);		   
		   
	   	}
	   
	   public BasePlusCommissionEmployee(int employeeId, String firstName, String lastName, 
			   double baseSalary) {
		   if (employeeId > 0) {
			   this.employeeId = employeeId; // assign employeeId to instance variable employeeId
		   }
		   else
		   {
			   System.out.printf("Enter valid Employee Id");
		   }
		   
		   if (firstName != "")
		   {
		      this.firstName = firstName;
		   }
		   else
		   {
			   System.out.printf("Enter First Name\n");
		   }
		   
		   if (lastName != "")
		   {
		      this.lastName = lastName;
		   }
		   else
		   {
			   System.out.printf("Enter Last Name!\n");
		   }
		   
		   if (baseSalary > 200)
		   {
		      this.baseSalary = baseSalary;
		   }		   	   
	   }
		 
	   public double earnings() {

			return commissionRate * (grossSales / 100) + baseSalary;
		}

		@Override
		public String toString() {
			return String.format("Employee Id:%d\nFirst Name:%s\nLast Name:%s\nBase Salary:$%.2f\n"
					+ "Gross Sales:$%.2f\nCommission Rate:%.2f\nEarnings:%.2f\n",
					this.getEmployeeId(), this.getFirstName(), this.getLastName(), this.getBaseSalary(), 
					this.getGrossSales(), this.getCommissionRate(), this.earnings());
		}
	   
}
