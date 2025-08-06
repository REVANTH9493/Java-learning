import java.util.*;
public class Concatination {
    public static void main(String[] args) {
        String ab = "Nagidir";
        String cd = "Revanth";
        ab = ab.toLowerCase();
        cd = cd.toLowerCase();
        char d = ab.charAt(ab.length()-1);
        char e = cd.charAt(0);
        StringBuilder a = new StringBuilder(ab);
        StringBuilder b = new StringBuilder(cd);
        System.out.println(d + " " + e);
        if(d==e){
            a.deleteCharAt(a.length()-1);
        }
        a = a.append(" ");
        a = a.append(b);
        System.out.println(a);
    }
}
