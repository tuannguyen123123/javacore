package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public void show() {

		System.out.println("cac metacharacter d....");// d nghia la ky so
														// (digit)

		System.out.println(Pattern.matches("\\d", "abc"));// false (non-digit)
		System.out.println(Pattern.matches("\\d", "1"));// true (digit va xuat
														// hien mot lan)
		System.out.println(Pattern.matches("\\d", "4443"));// false (digit nhung
															// xuat hien nhieu
															// hon mot lan)
		System.out.println(Pattern.matches("\\d", "323abc"));// false (digit va
																// char)

		System.out.println("cac metacharacter D....");// D nghia la khong phai
														// ky so (non-digit)

		System.out.println(Pattern.matches("\\D", "abc"));// false (non-digit
															// nhung xuat hien
															// nhieu hon mot
															// lan)
		System.out.println(Pattern.matches("\\D", "1"));// false (digit)
		System.out.println(Pattern.matches("\\D", "4443"));// false (digit)
		System.out.println(Pattern.matches("\\D", "323abc"));// false (digit va
																// char)
		System.out.println(Pattern.matches("\\D", "m"));// true (non-digit va
														// xuat hien mot lan)

		System.out.println("cac metacharacter D voi quantifier....");
		System.out.println(Pattern.matches("\\D*", "mak"));// true (non-digit va
															// co the xuat hien
															// 0 hoac nhie lan)

	}

	public static void main(String args[]) {

		// String de duoc quet de tim pattern.
		String line = " Regex! 1000  0USD";
		String pattern = "(.*)(\\d+)(.*)";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		if (m.find()) {
			System.out.println("The heart is instead: " + m.group(0));
			System.out.println("The heart is instead: " + m.group(1));
			System.out.println("The heart is instead: " + m.group(2));
		} else {
			System.out.println("No connection");
		}
		RegexMatches matches = new RegexMatches();
		matches.show();
	}
}
