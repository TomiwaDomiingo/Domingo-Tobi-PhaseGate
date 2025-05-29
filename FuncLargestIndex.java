public class FuncLargestIndex{
public static int largestIndex(int[] number){

int largest = (number[0]);

for(int track = 1; track < number.length; track++){
if (number[track] > largest);
largest = number[track];
return largest;
}

public static void main(String[] args){
int[] number = {1,5,3,4,5,5};

Sytem.out.println("result: " + largestIndex(number));
}
}
}
