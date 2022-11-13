import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dz8_4 {
    public static void main(String[] args) {
        String str = "ab abab abab abababab abea";
        String found = "\\b(ab)+\\b";
        Pattern pat = Pattern.compile(found);
        Matcher mat = pat.matcher(str);
        while (mat.find()) {
            System.out.println(mat.group());
        }
    }
}
