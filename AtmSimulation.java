import java.util.Scanner;
public class AtmSimulation {
public static void main(String[] args) {
AtmApp atmSimulation = new AtmApp();
boolean accountCreated = false;
Scanner input = new Scanner(System.in);
while (true) {
System.out.println("\nWelcome to Semicolon Bank");
if (!accountCreated) {
System.out.println("1. Create Account");
System.out.println("2. Exit");
} else {
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. View History");
System.out.println("4. View Balance");
System.out.println("5. Exit");
}
System.out.print("Enter choice: ");
int choice;

choice = input.nextInt();
input.nextLine();
} catch (Exception e) {
System.out.println("Invalid input. Please enter a number.");
input.nextLine();
continue;
}

if (choice == 1) {
System.out.print("Enter your name: ");
String name = input.nextLine();
System.out.print("Enter initial balance: ");
double initialBalance;

initialBalance = input.nextDouble();
input.nextLine();
}
System.out.println("Invalid balance. Please enter a number.");
input.nextLine();
continue;

if (atmSimulation.createAccount(name, initialBalance)) {
accountCreated = true;
System.out.println("Account created successfully!");
} else {
System.out.println("Failed to create account. Ensure name is not empty and balance is non-negative.");
}
} else if (choice == 2) {
System.out.println("Thanks for using Semicolon Bank!");
break;
} else {
System.out.println("Pick 1 or 2.");
}
} else {
if (choice == 1) {
System.out.print("Enter amount to deposit: ");
double amount;

amount = input.nextDouble();
input.nextLine();
} 
System.out.println("Invalid amount. Please enter a number.");
input.nextLine();
continue;

if (atmSimulation.deposit(amount)) {
System.out.println("Deposit successful! New balance: " + atmSimulation.getBalance());
} else {
System.out.println("Invalid deposit amount.");
}
} else if (choice == 2) {
System.out.print("Enter amount to withdraw: ");
double amount;

amount = input.nextDouble();
input.nextLine();
} 
System.out.println("Invalid amount. Please enter a number.");
input.nextLine();
continue;
}
if (atmSimulation.withdraw(amount)) {
System.out.println("Withdrawal successful! New balance: " + atmSimulation.getBalance());
} else {
System.out.println("Cannot withdraw. Check amount or balance.");
}
} else if (choice == 3) {
String[] history = atmSimulation.showHistory();
System.out.println("Transaction History:");
if (history.length == 0) {
System.out.println("No transactions yet.");
} else {
for (int historyIndex = 0; historyIndex < history.length; historyIndex++) {
System.out.println((historyIndex + 1) + ". " + history[historyIndex]);
}
}
} else if (choice == 4) {
System.out.println("Hello " + atmSimulation.getAccountName() + "! Your balance is: " + atmSimulation.getBalance());
} else if (choice == 5) {
System.out.println("Thanks for using Semicolon Bank!");
break;
} else {
System.out.println("Pick a number between 1 and 5.");
}
}
}
input.close();
}
}