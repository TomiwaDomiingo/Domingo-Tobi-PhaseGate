public class FuncPrintfactorial{
public static int factorialPrint(int number){

if(number > 0){
for(count = number; count >= number; count++);
result =  result * count;
}
return result;
}
}


public static void main(String[] args){
number = 1;
result =  FuncPrintfactorial.factorialPrint(number);
System.out.println(result);
}
