public class SavingsAccount extends Account {
	float interestRate;
	SavingsAccount()
	{
		interestRate=(float)(Math.random()*10);
	}
	public float calculateYearlyInterest()
	{
		return balance*interestRate;
	}
	
}
