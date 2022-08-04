public class ProxyBankDatabase implements BankInterface {
    private BankDatabase bankDatabase;

    @Override
    public void transfer(int sourceAccountNum, int targetAccountNum) {
        if(bankDatabase == null) {
            bankDatabase = new BankDatabase();
        }
        bankDatabase.transfer(sourceAccountNum, targetAccountNum);
    }

    @Override
    public boolean authenticateUser(int userAccountNumber, int userPIN) {
        if(bankDatabase == null) {
            bankDatabase = new BankDatabase();
        }
        return bankDatabase.authenticateUser(userAccountNumber, userPIN);
   }

   @Override
   public double getAvailableBalance(int userAccountNumber) {
       if(bankDatabase == null) {
            bankDatabase = new BankDatabase();
        }
        return bankDatabase.getAvailableBalance(userAccountNumber);
   } 

   @Override
   public double getTotalBalance(int userAccountNumber) {
        if(bankDatabase == null) {
            bankDatabase = new BankDatabase();
        }
        return bankDatabase.getTotalBalance(userAccountNumber);
   }
}