import java.util.*;
public class Trim_string {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Suman");
        s.deleteCharAt(0);
        s.deleteCharAt(s.length()-1);
        System.out.println(s);
    }
}
