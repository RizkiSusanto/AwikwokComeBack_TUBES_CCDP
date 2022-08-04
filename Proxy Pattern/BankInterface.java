public interface BankInterface {
    void transfer(int sourceAccountNum, int targetAccountNum);
    boolean authenticateUser(int userAccountNumber, int userPIN);
    double getAvailableBalance(int userAccountNumber);
    double getTotalBalance(int userAccountNumber);
}