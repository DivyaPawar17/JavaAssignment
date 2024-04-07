package Java;

public class HousingLoan extends LoanAccount {
	int tenure;
	public HousingLoan(String accNo,double loanAmmount,int tenure)
	{
	super(accNo,loanAmmount);
	this.tenure=tenure;
	}
	public void extendTenure(int yr)
	{
	tenure=tenure+yr;
	System.out.println("Tenure extended successfully by" +yr+ "years");
	}
}
 
