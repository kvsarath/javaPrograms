/**
 * 
 */
package patternMatcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Matcher;

/**
 * @author sarath
 *
 */
public class RegexMatcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String maskedCCNum = "";
		String ccNum="4xX111141114111";
		double dCC = Double.parseDouble(ccNum);
		String regex="[0-9Xx]+";
		/*if(ccNum.matches("[0-9]") == false)
		{System.out.println("go ahead");}*/
		StringBuffer sb = new StringBuffer();
		int leftOffset=6;
		int rightOffset=4;
		 try {
			 int len = (ccNum.trim()).length();
			 sb.append(ccNum);
			 if (len > 9)
				{
				 //double dCC = Double.parseDouble(ccNum);
				 int startPos = 0+leftOffset;
				 int endPos = len-rightOffset;
				 Pattern pattern = Pattern.compile(regex);
					//Matcher m = pattern.matcher(sb.substring(startPos,endPos));
					Matcher m = pattern.matcher(ccNum);
					if(m.matches() == true)
					{System.out.println("go ahead");}
					String lastStr = sb.substring(endPos,len);
					//System.out.println("lastStr is: " +lastStr);
					sb.delete(startPos,len);
					//System.out.println("StringBuffer: " +sb);
					while (m.find()) {
						//System.out.println("in while loop");
						m.appendReplacement(sb, "X");
					}
					m.appendTail(sb);
					System.out.println("stringbuffer append  :" +sb);
					sb.append(lastStr);
					System.out.println("Final stringbuffer:" +sb);
				}
		 }
		 finally {}
	/*catch (NumberFormatException e) {
		//throw new Exception (e);
		e.printStackTrace();
		System.out.println("Catch block");
	}
		 catch (PatternSyntaxException p) {
				//throw new Exception (e);
				System.out.println("Catch block");
	}*/
	}
}
