import java.util.Scanner;
public class Copies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = a.substring(0, 2);
        String c = "";
        for(int i=0; i<a.length(); i++){
            c = c + b;
        }
        System.out.println(c);
        
    }
}
