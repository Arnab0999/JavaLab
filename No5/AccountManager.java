public class AccountManager{
        private int NumberOfAccounts = -1;
        BankAccount bankAccount[] = new BankAccount[5];

        public void Create(BankAccount src){
                NumberOfAccounts++;

                bankAccount[NumberOfAccounts] = src;
        }

        public void Delete(BankAccount src){
                for(int i =1000;i<NumberOfAccounts;i++){
                        if(src.GetAccountNumber() == i){
                                for(int j = i;j<NumberOfAccounts;j++){
                                        bankAccount[j] = bankAccount[j+1];
                                }
                                NumberOfAccounts--;
                        }
                }
        }

        public void Deposit(BankAccount src, int Ammount){
                for(int i =0;i<NumberOfAccounts;i++){
                        if(src.GetAccountNumber() == i){
                                bankAccount[i].Deposit(Ammount);
                        }
                }
        }
        public void Withdraw(BankAccount src, int Ammount){
                for(int i =0;i<NumberOfAccounts;i++){
                if(src.GetAccountNumber() == i){
                                bankAccount[i].Withdraw(Ammount);
                        }
                }
        }


}
