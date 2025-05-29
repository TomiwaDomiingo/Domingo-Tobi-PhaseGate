public class FuncPrintfactorial{
public static int factorialPrint(int number) {
int result = 1; 
if (number >= 0){
for (int count = 1; count <= number; count++){ 
result = result * count;
}
}
return result;
}
public static void main(String[] args) {
int number = 1; 
int result = factorialPrint(number); 
System.out.println(result);
}
}