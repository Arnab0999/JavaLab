import java.util.*;
public class Account {
	int accountNumber;
	String holderName;
	float balance;
	protected static String getSaltString()
    {
            String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            StringBuilder salt = new StringBuilder();
            Random rnd = new Random();
            while (salt.length() < 18)
            {
                    int index = (int) (rnd.nextFloat() * SALTCHARS.length());
                    salt.append(SALTCHARS.charAt(index));
            }
            String saltStr = salt.toString();
            return saltStr;
    }
	Account()
	{
		accountNumber=(int)(Math.random()*100);
		holderName=getSaltString();
		balance=(float)(Math.random()*100);
    }
    @Override
    public String toString() {
        return accountNumber+"\t"+holderName+"\t"+balance;
    }
}
