package patternMatcher;
import java.util.*;
public class wordCountinString {
public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the sentence : ");
	String sentence=input.nextLine();
	System.out.println("Enter the word : ");
	String word=input.nextLine();
	input.close();
	String[] items=sentence.split(" ");
	int j=0;
	for(int i=0;i<items.length-1;i++)
	{
		if(items[i].equals(word))
		{
			j++;
			
		}
	}

	System.out.println("Number of occurences of word "+word+" in sentence "+sentence+" is" +j);
}
}
