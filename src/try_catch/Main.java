package try_catch;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Kaan", 17002);
		Employee emp2 = new Employee("Arda", 45000);
		
		try {
			emp1.PaySalary();
		} catch (SalaryPaidOnBankException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			emp2.PaySalary();
		} catch (SalaryPaidOnBankException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
