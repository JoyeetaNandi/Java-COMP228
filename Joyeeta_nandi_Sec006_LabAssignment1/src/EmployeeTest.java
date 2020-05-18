
public class EmployeeTest {

	public static void main(String[] args) {
		
		//Exercise#1			
		CommissionEmployee commissionEmployee1 = new CommissionEmployee(-12, "Joyeeta", "Nandi", 150, 0);
		System.out.println(commissionEmployee1.toString());
		
		CommissionEmployee commissionEmployee2 = new CommissionEmployee(222, "Biplob", "");		
		System.out.println(commissionEmployee2.toString());
		
		
		//Exercise#2
		
		BasePlusCommissionEmployee basePlusCommissionEmployee1 = new BasePlusCommissionEmployee(333, "Debjyoti", "Sarker", 30, 150, 0.5);
		System.out.println(basePlusCommissionEmployee1.toString());
		
		BasePlusCommissionEmployee basePlusCommissionEmployee2 = new BasePlusCommissionEmployee(444, "Nisha", "", 150);				
		System.out.println(basePlusCommissionEmployee2.toString());
		
		
		//Exercise#3
		HourlyEmployee hourlyEmployee1 = new HourlyEmployee(555, "Shreya", "Sarker", 15, 10);
		System.out.println(hourlyEmployee1.toString());
		
		HourlyEmployee hourlyEmployee2 = new HourlyEmployee(666, "Soma", "Chowdhury");
		System.out.println(hourlyEmployee2.toString());		
		
	}

}
