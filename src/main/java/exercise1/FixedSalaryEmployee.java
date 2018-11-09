package exercise1;

public class FixedSalaryEmployee extends Employee {
	private int fixedSalary;

	public FixedSalaryEmployee(String name, int fixedSalary)
	{
		super(name,0,0);
		this.fixedSalary=fixedSalary;
	}

	@Override
	public int computeSalary() {
		return this.fixedSalary;
	}
}
