public class Example15 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int rev = 0;
        while(a!=0){
            rev = rev*10 + a%10;
            a/=10;
        }
        System.out.println(rev);
    }
}
