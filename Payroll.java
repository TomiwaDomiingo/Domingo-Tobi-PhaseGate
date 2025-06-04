import java.util.Scanner;
public class Payroll{
static class Employee{
String name;
double hours;
double payRate;
double federalTaxRate;
double stateTaxRate;
}


static void addEmployee(Employee[] employees, int[] employeeCount, Scanner input){
System.out.print("Enter Employee Name: ");
String name = input.nextLine();
boolean exists = false;
for (int currentEmployee = 0; currentEmployee < employeeCount[0]; currentEmployee++){
String employeeName = employees[currentEmployee].name;

if (employeeName.equals(name)) {
System.out.println(name + " already exists");
exists = true;
break;
}
}

if (!exists) {
Employee employee = new Employee();
employee.name = name;
System.out.print("Enter number of hours you worked for this week: ");
double hours = input.nextDouble();

if (hours >= 160) {
System.out.println("hours exceeded");
System.out.print("do you wish to continue (yes/no): ");
String continueChoice = input.next();

if (!continueChoice.equalsIgnoreCase("yes")) {
return;
}
}
employee.hours = hours;
System.out.print("Enter hourly pay rate: ");
double payRate = input.nextDouble();
employee.payRate = payRate;

System.out.print("Enter Federal tax withholding rate: ");
double federalTaxRate = input.nextDouble();
employee.federalTaxRate = federalTaxRate;

System.out.print("Enter state tax withholding rate: ");
double stateTaxRate = input.nextDouble();

employee.stateTaxRate = stateTaxRate;
employees[employeeCount[0]] = employee;
employeeCount[0]++;
System.out.println("Employee payroll added");
}
}

static void viewEmployee(Employee[] employees, int employeeCount, Scanner input){
System.out.print("Enter Employee Name: ");
String name = input.nextLine();
for (int currentEmployee = 0; currentEmployee < employeeCount; currentEmployee++){
String employeeName = employees[currentEmployee].name;

if (employeeName.equals(name)) {
double hours = employees[currentEmployee].hours;
double payRate = employees[currentEmployee].payRate;
double federalTaxRate = employees[currentEmployee].federalTaxRate;

double stateTaxRate = employees[currentEmployee].stateTaxRate;
double grossPay = hours * payRate;

double federalTax = grossPay * (federalTaxRate / 100);
double stateTax = grossPay * (stateTaxRate / 100);

double totalDeduction = federalTax + stateTax;
double netPay = grossPay - totalDeduction;

System.out.println("\nEmployee name: " + employeeName);
System.out.println("Hours Worked: " + hours);
System.out.println("Pay rate: " + payRate);
System.out.println("Gross pay: " + grossPay);
System.out.println("Deductions:");
System.out.println("Federal withholding (" + federalTaxRate + "%): " + federalTax);
System.out.println("State withholding (" + stateTaxRate + "%): " + stateTax);
System.out.println("Total Deduction: " + totalDeduction);
System.out.println("Net Pay: " + netPay);
break;
}
}
}

static void updateEmployee(Employee[] employees, int employeeCount, Scanner input){
System.out.print("Enter Employee Name: ");
String name = input.nextLine();

for (int currentEmployee = 0; currentEmployee < employeeCount; currentEmployee++){
String employeeName = employees[currentEmployee].name;
if (employeeName.equals(name)){
System.out.print("Enter number of hours worked in a week: ");
double hours = input.nextDouble();

if (hours >= 160){
System.out.println("hours exceeded");
System.out.print("do you wish to continue (yes/no): ");
String continueChoice = input.next();

}
employees[currentEmployee].hours = hours;
System.out.print("Enter hourly pay rate: ");
double payRate = input.nextDouble();

employees[currentEmployee].payRate = payRate;
System.out.print("Enter Federal tax withholding rate: ");
double federalTaxRate = input.nextDouble();

employees[currentEmployee].federalTaxRate = federalTaxRate;
System.out.print("Enter state tax withholding rate: ");
double stateTaxRate = input.nextDouble();
employees[currentEmployee].stateTaxRate = stateTaxRate;
System.out.println("Employee payroll updated");
break;
}
}
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Employee[] employees = new Employee[100];
int[] employeeCount = {0};
int choice;
while (true){
System.out.println("\nWELCOME TO SEMICOLON PAYROLL");
System.out.println("1. Add Employee Payroll");
System.out.println("2. View Employees Payroll");
System.out.println("3. Update Employee Payroll");
System.out.println("4. Exit");
System.out.print("Enter input: ");
choice = input.nextInt();
input.nextLine();

if (choice == 1) {
addEmployee(employees, employeeCount, input);
} else if(choice == 2){
viewEmployee(employees, employeeCount[0], input);
} else if(choice == 3){
updateEmployee(employees, employeeCount[0], input);
} else if(choice == 4){
System.out.println("Ire o");
break;

}
}
input.close();
}
}