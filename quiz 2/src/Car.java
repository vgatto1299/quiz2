
public class Car {
	private double carCost;
	private double interestRate;
	private double downPayment;
	private int lengthOfLoan;

	public Car(double carCost, double interestRate, double downPayment, int lengthOfLoan) {
		this.carCost = carCost;
		this.interestRate = interestRate;
		this.downPayment = downPayment;
		this.lengthOfLoan = lengthOfLoan;
	}// end of constructor

	public double monthlyCarPayment() {
		double p = carCost - downPayment;
		double r = (interestRate / 12);
		double x = (p) * r * Math.pow(1 + r, lengthOfLoan) / (Math.pow(1 + r, lengthOfLoan) - 1);
		return x;

	}// end of car payment

	public double totalInterestPaid() {
		double total = this.monthlyCarPayment() * lengthOfLoan;
		return total - (carCost - downPayment);

	}// end of interest paid

}// Class end
