public class Bank{
        public static void main(String [] args){
                int AccountHolders = 5;
                BankAccount ba[] = new BankAccount[AccountHolders];
                 AccountManager am = new AccountManager();

                for(int i = 0;i<AccountHolders;i++){
                        ba[i] = new BankAccount(getSaltString(),(float)( Math.random()*1000));
                        am.Create(ba[i]);
                }
                System.out.println("AcNo\tName\tbalance");
                for (int i =0;i<AccountHolders ;i++ ) {
                        System.out.println(ba[i].GetAccountNumber()+"\t"+ba[i].GetName()+"\t"+ba[i].GetBalance());
                }

        }

        protected static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        while (salt.length() < 5) {
            int index = (int) ((float)Math.random() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
