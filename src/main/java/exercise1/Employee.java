package exercise1;

public abstract class Employee {
	protected String name;
	protected int Sales=0;
	protected int workedHours=0;

	public Employee(String name, int Sales, int workedHours)
	{
		this.name = name;
		this.Sales=Sales;
		this.workedHours=workedHours;
	}

	public abstract int computeSalary();

	public void sell()
	{
		Sales=Sales+1;
	}

	public void workOneHour()
	{
		workedHours=workedHours+1;
	}

	public String getName()
	{
		return name;
	}


}
