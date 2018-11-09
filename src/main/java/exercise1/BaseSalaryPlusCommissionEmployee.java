package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	private int baseSalary;
	private int commission;

	public BaseSalaryPlusCommissionEmployee(String name,int baseSalary,int commission)
	{
		super(name,0,0);
		this.baseSalary=baseSalary;
		this.commission=commission;
	}
	@Override
	public int computeSalary() {
		return (this.baseSalary + this.Sales*this.commission);
	}
}
