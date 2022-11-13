import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dz8_3 {
    public static void main(String[] args) {
        String str = "ahb acb aeb aeeb adcb axeb";
        String found = "\\ba.b\\b";
        Pattern pat = Pattern.compile(found);
        Matcher mat = pat.matcher(str);
        while (mat.find()) {
            System.out.println(mat.group());
        }
    }
}
