package Java;

public class SavingAccount extends Account {
	private double interestRate;

	public SavingAccount(String accNo, double interestRate) {
	super(accNo);
	this.interestRate = interestRate;
	}
	public double  addInterest()
	{
	double interest=bal*interestRate;
	bal=bal+interest;
	return interest;
	}
}
