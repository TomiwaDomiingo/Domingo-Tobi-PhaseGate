public class FuncLargestIndex {
public static int largestIndex(int[] number) {
if (number == null || number.length == 0) {
throw new IllegalArgumentException("Array cannot be null or empty");
}
int largest = number[0];
int largestIndex = 0;
for (int track = 1; track < number.length; track++) {
if (number[track] > largest) {
largest = number[track];
largestIndex = track;
}
}
return largestIndex;
}
public static void main(String[] args) {
int[] number = {1, 5, 3, 4, 5, 5};
System.out.println("result: " + largestIndex(number));
}
}