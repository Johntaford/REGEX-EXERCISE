import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		/*
		 * Write a method that will validate a string is all uppercase characters 
		 * Write a method that will validate if a string has at least one digit and allows for any other characters. 
		 * Write a method that will validate phone numbers. A phone number should be in the following format: {area code of 3 digits} – {3digits} – {4 digits}
		 *  Write a method that will validate date based on the following format: dd/mm/yyyy
		 */


	}
	
	
	
	  public void RegexUppercase (){ String Show = "SUPERSTAR"; String regEx =
	  "[A-Z]+"; Pattern p = Pattern.compile(regEx); Matcher matcher =
	  p.matcher(Show);
	  
	  while (matcher.find())
	  System.out.printf("Found %d, of captial letters in s%n",
	  matcher.groupCount(), Show);
	  
	  }
	 
	
	public boolean ContainsNumber () {
		Pattern pn = Pattern.compile("[0-9].*[0-9]");
		Matcher match = pn.matcher(toString());
		if (match.find()) {
		   return true;
	}
		
	public void  phoneNumber () {
		//2nd way - (313)555-9999
				boolean testPhoneNum = Pattern.matches("\\(\\d{3}\\)\\d{3}-\\d{4}", "(313)555-4444");
				System.out.println(testPhoneNum);
	}
	
	public void Date() {
		String Date = "05/17/2022";
		String Regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
		Pattern pattern = Pattern.compile(Regex);
		Matcher matcher = Pattern.matcher(Date);
		boolean todaysdate = matcher.matches();
		if(todaysdate) {
			System.out.println("Date is Valid");
		} else {
			System.out.println("Date is not Valid");
		}
	}

}
