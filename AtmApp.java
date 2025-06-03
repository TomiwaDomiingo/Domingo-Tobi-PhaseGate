import java.util.ArrayList;

public class AtmApp {
private String accountName;
private double balance;
private ArrayList<String> transactions;
public AtmApp() {
accountName = "";
balance = 0.0;
transactions = new ArrayList<>();
}
public boolean createAccount(String name, double accountBalance) {
if (name == null || name.trim().isEmpty() || accountBalance < 0) {
return false;
}
if (!accountName.isEmpty()) {
return false;
}
accountName = name;
balance = accountBalance;
transactions.add("Created account for " + name + " with balance " + accountBalance);
return true;
}
public boolean deposit(double amount) {
if (amount <= 0) {
return false;
}
balance += amount;
transactions.add("Deposited " + amount);
return true;
}
public boolean withdraw(double amount) {
if (amount <= 0) {
return false;
}
if (amount > balance) {
return false;
}
balance -= amount;
transactions.add("Withdrew " + amount);
return true;
}
public String[] showHistory() {
return transactions.toArray(new String[0]);
}
public double getBalance() {
return balance;
}
public String getAccountName() {
return accountName;
}
}