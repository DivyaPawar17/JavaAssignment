/*9. Create a class, named Account and include the required attributes and
behaviours in it. Inherit another class called “SavingsAccount” from it
and add new attributes and behaviours, as needed. Inherit another class
called “LoanAccount” from Account and add new attributes and
behaviours, as needed. Inherit another class called “HousingLoan” from
LoanAccount and add new attributes and behaviours, as needed. Create
objects of SavingsAccount and HousingLoan and perform the methods to
1. Open an account, 2. Deposit amount, 3. Withdraw amount, 4. Print
the account details. (Consider applying the Access Modifiers also)*/

package Java;

public class Account {
	protected String accNo;
	protected double bal;

	public Account(String accNo) 
	{
	this.accNo=accNo;
	bal=0;
		
	}
	public void openAccount()
	{
	System.out.println("Open an Account");
	}

	//Deposite
	public void  deposite(double amount) {
	bal = bal+amount;
	}


	//withdraw
	public void withdraw(double amount) {

	if (bal > amount) {
	bal=bal-amount;

	} else
	{
	System.out.println("Insufficient funds..");

	}
}
	public void printAccountDetails()
	{
	System.out.println("Account Number="+accNo);
	System.out.println("Account balance="+bal);


	}
}