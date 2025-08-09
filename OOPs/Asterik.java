import java.util.Scanner;

public class Asterik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == '*'){
                a = a.substring(0,i-1) + a.substring(i+2,a.length());
            }
        }
        System.out.println(a);
        
    }
}
