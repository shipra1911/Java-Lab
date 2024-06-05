// Create an interface called "BankAccount" with methods called "deposit" and "withdraw". Create a class called "CheckingAccount" that implements the BankAccount interface and implements the "deposit" and "withdraw" methods. Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.

// Define the BankAccount interface
interface BankAccount {
  // Method to deposit an amount
  void deposit(double amount);
  // Method to withdraw an amount
  void withdraw(double amount);
}

// Define the CheckingAccount class that implements the BankAccount interface
class CheckingAccount implements BankAccount {
  // Instance variable to hold the account balance
  private double balance;

  // Constructor to initialize the balance
  public CheckingAccount(double initialBalance) {
      this.balance = initialBalance;
  }

  // Implement the deposit method
  @Override
  public void deposit(double amount) {
      balance += amount;
      System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
  }

  // Implement the withdraw method
  @Override
  public void withdraw(double amount) {
      if (amount <= balance) {
          balance -= amount;
          System.out.println("Withdrew: $" + amount + ", New Balance: $" + balance);
      } else {
          System.out.println("Insufficient balance to withdraw: $" + amount);
      }
  }
}

// Main class to demonstrate the CheckingAccount functionality
public class BankApp {
  public static void main(String[] args) {
      // Create an instance of CheckingAccount with an initial balance
      CheckingAccount myAccount = new CheckingAccount(1000.00);

      // Call the deposit method
      myAccount.deposit(200.00);

      // Call the withdraw method
      myAccount.withdraw(150.00);

      // Call the withdraw method with an amount greater than the balance to demonstrate insufficient balance handling
      myAccount.withdraw(1200.00);
  }
}
