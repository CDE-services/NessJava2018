package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupRegexTest {
		private static final Pattern pattern 
		= Pattern.compile("(\\d{2})(\\d{2})"
				+ "(\\d{2})/(\\d{3,4})");
		
    public static void main(String[] args) {
        final String s = "123456/7890";
        
        Matcher matcher = pattern.matcher(s);

        if (matcher.matches()) {
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.printf(
                		"Group %d has content %s\n", i, 
                		matcher.group(i));
            }
            String rok = matcher.group(1);
            int r = Integer.parseInt(rok);
        }
    }
}
