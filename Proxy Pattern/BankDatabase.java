// BankDatabase.java
// Represents the bank account information database 
import java.util.Scanner;

public class BankDatabase implements BankInterface {
   private Account[] accounts; // array of Accounts
   private Screen screen; // ATM's screen
   private Keypad keypad;
   
   // no-argument BankDatabase constructor initializes accounts
   public BankDatabase() {
      accounts = new Account[4]; // just 2 accounts for testing
      accounts[0] = new Account(12345, 54321, 1000.0, 1200.0);
      accounts[1] = new Account(98765, 56789, 200.0, 200.0);
      accounts[2] = new Account(00000, 32420);  
   }
   
   // retrieve Account object containing specified account number
   private Account getAccount(int accountNumber) {
      // loop through accounts searching for matching account number
      for (Account currentAccount : accounts) {
         // return current account if match found
         if (currentAccount.getAccountNumber() == accountNumber) {
            return currentAccount;
         }
      } 

      return null; // if no matching account was found, return null
   } 

   // determine whether user-specified account number and PIN match
   // those of an account in the database
   @Override
   public boolean authenticateUser(int userAccountNumber, int userPIN) {
      // attempt to retrieve the account with the account number
      Account userAccount = getAccount(userAccountNumber);

      // if account exists, return result of Account method validatePIN
      if (userAccount != null) {
         return userAccount.validatePIN(userPIN);
      }
      else {
         return false; // account number not found, so return false
      }
   } 

   // return available balance of Account with specified account number
   public double getAvailableBalance(int userAccountNumber) {
      return getAccount(userAccountNumber).getAvailableBalance();
   } 

   // return total balance of Account with specified account number
   public double getTotalBalance(int userAccountNumber) {
      return getAccount(userAccountNumber).getTotalBalance();
   }

   public void setNewPIN(int userAccountNumber, int newpin) {
      Account userAccount = getAccount(userAccountNumber);
      if(userAccount.getAccountPIN() == newpin)
      {
         System.out.println("PIN baru tidak boleh sama dengan PIN Lama!");
      } else if(userAccount.getAccountPIN()%1000 == newpin%1000)
      {
         System.out.println("3 angka terakhir PIN baru tidak boleh sama dengan 3 angka terakhir PIN Lama!");
      } else if(newpin==00000)
      {
         System.out.println("PIN tidak bisa 0 semuanya!");
      } else
      {
         userAccount.setPIN(newpin);
         System.out.println("PIN sudah terganti!");
      }
   }

   @Override
   public void transfer(int sourceAccountNum, int targetAccountNum) {
      Scanner in = new Scanner(System.in);
      Account srcAccount = getAccount(sourceAccountNum);
      Account destAccount = getAccount(targetAccountNum);
      if(destAccount != null) {
         if(srcAccount.getAccountNumber() == destAccount.getAccountNumber()) {
            System.out.println("Tidak bisa mengirim ke akun sendiri!");
         } else
         {
            System.out.println("\nEnter amount of transfer: ");
            int amount = in.nextInt();
            if(amount > srcAccount.getAvailableBalance()) {
               System.out.println("Balance anda tidak cukup untuk melakukan transfer!");
            } else
            {
               srcAccount.debit(amount);
               destAccount.credit(amount);
               System.out.println("Transfer berhasil dilakukan...");
            }
         }
      } else
      {
         System.out.println("Akun tujuan tidak ditemukan!");
      }
   }

   // credit an amount to Account with specified account number
   public void credit(int userAccountNumber, double amount) {
      getAccount(userAccountNumber).credit(amount);
   }

   // debit an amount from Account with specified account number
   public void debit(int userAccountNumber, double amount) {
      getAccount(userAccountNumber).debit(amount);
   } 
} 




/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/