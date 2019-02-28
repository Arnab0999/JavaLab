import java.util.*;
public class Manager {
	Account foo[] = new Account[5];
    int index=-1;
    void add(Account A)
    {
        index++;
        foo[index]=A;
    }
	public static void main(String[] args) {
        Manager M = new Manager();
        SavingsAccount S[] = new SavingsAccount[2];
        CurrentAccount C[] = new CurrentAccount[3];
        for (int i = 0; i < 2; i++) {
            S[i] = new SavingsAccount();
            M.add(S[i]);
        }
        for (int i = 0; i < 3; i++) {
            C[i] = new CurrentAccount();
            M.add(C[i]);
        }
        M.Display();
    }
    void Display()
    {
        System.out.println("AcNo.\tHolder Name\t\tBalance");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(foo[i].toString());
        }
    }
}
