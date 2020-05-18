
public class HourlyEmployee {
	
	//Define data type
	private int employeeId;
	private String firstName;
	private String lastName;
	private float totalHoursPerWeek;
	private float hourlyRate = 14;
	
	//Define getter
	
	public int getEmployeeId() {
		return employeeId;			
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	//Define getter and setter
	public float getTotalHoursPerWeek() {
		return totalHoursPerWeek;
	}
	public void setTotalHoursPerWeek(float totalHoursPerWeek) {
		if (totalHoursPerWeek <= 0)
			System.out.println("Enter valid hour!/n");
		else
			this.totalHoursPerWeek = totalHoursPerWeek;
	}
	
	
	public float getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(float hourlyRate) {
		if (hourlyRate < 14)
			System.out.println("Enter valid hourly rate!\n");
		else
			this.hourlyRate = hourlyRate;
	}
	
	//Constructor with all variables
		
	public HourlyEmployee(int employeeId, String firstName, String lastName, float totalHoursPerWeek, float hourlyRate) {
		// set Employee Id
		if (employeeId <= 0)
			System.out.println("Enter valid Id!\n");
		else
			this.employeeId = employeeId;
		
		//set First name
		if (firstName == "")
			System.out.println("Enter First name!\n");
		else
			this.firstName = firstName;
		
		//set Last name
		if (lastName == "")
			System.out.println("Enter Last name!\n");
		else
			this.lastName = lastName;
		
		setTotalHoursPerWeek(totalHoursPerWeek);
		setHourlyRate(hourlyRate);
		
	}// end Constructor
	
	//Constructor with three variables
	
		public HourlyEmployee(int employeeId, String firstName, String lastName) {
			// set Employee Id
			if (employeeId <= 0)
				System.out.println("Enter valid Id!\n");
			else
				this.employeeId = employeeId;
			
			//set First name
			if (firstName == "")
				System.out.println("Enter First name!\n");
			else
				this.firstName = firstName;
			
			//set Last name
			if (lastName == "")
				System.out.println("Enter Last name!\n");
			else
				this.lastName = lastName;			
			
		}// end Constructor
		
		 public float earnings() {

				return totalHoursPerWeek * hourlyRate;
			}

			@Override
			public String toString() {
				return String.format("Employee Id:%d\nFirst Name:%s\nLast Name:%s\n"
						+ "Total hours worked per week:%.2f\nHourly Rate:%.2f\nEarnings:$%.2f\n",
						this.getEmployeeId(), this.getFirstName(), this.getLastName(), this.getTotalHoursPerWeek(), 
						this.getHourlyRate(), this.earnings());
			}
	
} //end class
