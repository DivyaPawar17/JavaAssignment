package Java;

public class TestAcc {	public static void main(String[] args) {
		SavingAccount s=new SavingAccount("SA20052",0.05);
		s.deposite(5000);
		s.printAccountDetails();
		s.addInterest();
		s.printAccountDetails();
		System.out.println("===========================");

		HousingLoan h=new HousingLoan("HA266656", 5000, 10);
		h.payEMI(1500);
		h.extendTenure(10);
	}
}