public class BankAccount{
        private static int AccountHolders ;
        private int AccountNumber;
        private float Balance;
        private String OwnerName;

        static{
                AccountHolders = 1000;
        }
        public BankAccount(){
                AccountNumber = 0;
                OwnerName = "No Name";
        }

        public BankAccount(String OwnerName, float Balance){
                this.AccountNumber = AccountHolders;
                this.Balance = Balance;
                this.OwnerName = OwnerName;
                this.AccountHolders++;
        }

        public float GetBalance(){
                return Balance;
        }
        public int GetAccountNumber(){
                return AccountNumber;
        }
        public void Deposit(float Ammount){
                this.Balance = this.Balance + Ammount;
        }
 public void Withdraw(float Ammount){
                this.Balance = this.Balance - Ammount;
        }
        public String GetName(){
                return OwnerName;
        }
}
