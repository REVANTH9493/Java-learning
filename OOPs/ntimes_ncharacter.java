import java.util.Scanner;

public class ntimes_ncharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        for(int i=0; i<b; i++){
            System.out.print(a.substring(a.length()-3, a.length()));
        }
    }
}
