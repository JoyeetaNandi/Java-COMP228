
public class CommissionEmployee {

	// instance variables

	private int employeeId;
	private String firstName;
	private String lastName;
	private double grossSales;
	private double commissionRate = 0.1;

	// method that returns the employeeId, First Name and Last Name

	public int getEmployeeId() {

		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	// method that gets and sets the Gross Sales 

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales <= 0)
			System.out.println("Enter valid gross sales amount!/n");
		else
			this.grossSales = grossSales;
	}

	// method that gets and sets the Commission Rate
	
	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate < 0.1 || commissionRate > 1)
			System.out.println("Enter valid Commission rate!");
			//this.commissionRate = 0.1;
		else
			this.commissionRate = commissionRate;
	}

	// Constructor with all data members

	public CommissionEmployee(int employeeId, String firstName, String lastName, double grossSales,
			double commissionRate) {

		if (employeeId <= 0)
			System.out.println("Enter valid Employee Id!");		
		
		else
			this.employeeId = employeeId; // assign employeeId to instance variable employeeId
		
		if (firstName == "")
			System.out.println("Enter First Name!\n");
		else
			this.firstName = firstName;
		if (lastName == "")
			System.out.println("Enter Last Name!\n");
		else
			this.lastName = lastName;

		setGrossSales(grossSales);

		setCommissionRate(commissionRate);

	}

	// second constructor

	public CommissionEmployee(int employeeId, String firstName, String lastName) {

		if (employeeId <= 0)
			System.out.println("Enter valid Employee Id!\n");
		else
			this.employeeId = employeeId; // assign employeeId to instance variable employeeId
		if (firstName == null)
			System.out.println("Enter First Name!\n");
		else
			this.firstName = firstName;
		if (lastName == "")
			System.out.println("Enter Last Name!\n");
		else
			this.lastName = lastName;
	}

	public double earnings() {

		return commissionRate * grossSales / 100;
	}

	@Override
	public String toString() {
		return String.format("Employee Id:%d\nFirst Name:%s\nLast Name:%s\nGross Sales:$%.2f\nCommission "
				+ "Rate:%.2f\nEarnings:%.2f\n",
				this.getEmployeeId(), this.getFirstName(), this.getLastName(), this.getGrossSales(), 
				this.getCommissionRate(), this.earnings());
	}

} // end class
