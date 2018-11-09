package exercise1;

public class WorkHourSalaryEmployee extends Employee {
	private int hourRate;

	public WorkHourSalaryEmployee(String name,int hourRate)
	{
		super(name,0,0);
		this.hourRate=hourRate;
	}
	@Override
	public int computeSalary()
	{
		return (this.hourRate*this.workedHours);
	}
}
