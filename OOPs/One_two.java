import java.util.Scanner;

public class One_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int c = a.length()<b.length()?a.length():b.length();
        for(int i=0; i<c; i++){
            System.out.print(a.charAt(i));
            System.out.print(b.charAt(i));
        }
        if(a.length()>b.length()){
            System.out.println(a.substring(c, a.length()));
        }
        else if(b.length()>a.length()){
            System.out.println(b.substring(c, a.length()+1));
        }
    }
}
