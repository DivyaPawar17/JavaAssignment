package Java;

public class LoanAccount extends Account {
	double loanAmmount;


	public LoanAccount(String accNo, double loanAmmount) {
	super(accNo);
	this.loanAmmount = loanAmmount;

	}
	public void payEMI(double emi)
	{
	if(bal>emi)
	{
	System.out.println("EMI paid successfully");
	loanAmmount=loanAmmount-emi;
	}
	else
	System.out.println("insufficient fund");
	}
}

