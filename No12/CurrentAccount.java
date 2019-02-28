public class CurrentAccount extends Account {
    int CurrentNumber;
    CurrentAccount()
    {
        CurrentNumber=(int)(Math.random()*10);
    }
	void Deposit(float money)
	{
		balance+=money;
	}
	void Transaction(float money)
	{
		if(money>=balance)
		{
			System.out.println("Insufficient Balance");
		}
		else
			balance-=money;
	}
}
