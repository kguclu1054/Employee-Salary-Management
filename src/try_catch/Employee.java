package try_catch;

public class Employee {

	private String name; 
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void PaySalary() throws SalaryPaidOnBankException{
		if(salary >= 20000) {
			throw new  SalaryPaidOnBankException("Maaş 17.000 tl üzerinde olanlar parayı bankaya yatırmalıdırlar:" + name + " 'nın maaşı" + salary + " dir");
		}else {
			System.out.println(name + " maaşı ödendi: " + salary + " TL.");
		}
	}
}
