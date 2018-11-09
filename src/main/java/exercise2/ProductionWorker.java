package exercise2;

public class ProductionWorker implements Payable{
	private int salaryPerProducePiece;
	private int number=0;

	public void produceOnePiece() {
	this.number++;
	}
	public ProductionWorker(int salaryPerProducePiece){
		this.salaryPerProducePiece=salaryPerProducePiece;
	}
	public int computeSalary() {
		return (this.number*this.salaryPerProducePiece);
	}
}
