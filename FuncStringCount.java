public class FuncStringCount{
public static int stringOccurence(String word, char letter){
int count = 0;
word = word.toLowerCase(); 
for (int currentIndex = 0; currentIndex < word.length(); currentIndex++){ 
if (word.charAt(currentIndex) == Character.toLowerCase(letter)){ 
count++;
}
}
return count; 
}
public static void main(String[] args){
String word = "baboon"; 
char letter = 'o';
int output = stringOccurence(word, letter); 
System.out.println(output); 
}
}