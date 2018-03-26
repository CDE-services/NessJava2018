package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFindTest {
		private static final Pattern pattern 
		= Pattern.compile("(\\d{2})");
		
    public static void main(String[] args) {
        final String s = "fd12fjsdkl134fjsdkal54/fjklsda78fjdsklaf90";
        
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            String cislo = matcher.group(1);
            System.out.println(cislo);
        }
    }
}
