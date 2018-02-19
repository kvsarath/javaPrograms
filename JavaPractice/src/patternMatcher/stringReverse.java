package patternMatcher;
import java.util.Scanner;

public class stringReverse {
public static void main(String[] args){
	System.out.println("Enter string to reverse:");
	
	Scanner read = new Scanner(System.in);
	String str = read.nextLine();
	String reverse = "";
	read.close();
	
	for(int i = str.length() - 1; i>=0; i--)
	{
		reverse = reverse + str.charAt(i);
	}
	System.out.println(reverse);
	if(str.equals(reverse))
	{System.out.println("Entered String is a palindrome");}
	else
	{System.out.println("Entered String is a not a palindrome");}
	/*System.out.println("Reversed string is:");
	System.out.println(reverse);*/
}
}

