import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count = 0;
        int length = 0;
        for(int i=0; a!=0; i++){
            count = count + a%10;
            a =a/10;
        }
        System.out.println(count);
    }
}
