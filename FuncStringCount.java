public class FuncStringCount{
public static String stringOccurence(String word, char letter){
int count = 0;
for(int currentIndex = 0; currentIndex < word.length; currentIndex++){
String result = word.toLowercase();
if(result.charAt(currentIndex) == letter){
count++;
}
}
}
return count;
}

public static void main(String[] args){
String word = ("baboon");
char letter = 'o';
FuncStringCount wordsChecker = new FuncStringCount();
int output = wordsChecker.stringOccurence(word);
System.out.print(output);
}
}
