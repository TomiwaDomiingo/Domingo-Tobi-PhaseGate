public class SortInDecending {
public static int[] sortDecending(int[] listOfNumbers) {
int length = listOfNumbers.length;
for (int round = 0; round < length - 1; round++) {
for (int position = 0; position < length - 1 - round; position++) {
if (position > 0 && listOfNumbers[position] < listOfNumbers[position - 1]) {
int temp = listOfNumbers[position];
listOfNumbers[position] = listOfNumbers[position - 1];
listOfNumbers[position - 1] = temp;
}
}
}
return listOfNumbers;
}
public static void main(String[] args) {
int[] listOfNumbers = {3, 1, 5, 8, 6, 4};
int[] sortedList = sortDecending(listOfNumbers);
for (int number : sortedList) {
System.out.print(number + " ");
}
System.out.println();
}
}