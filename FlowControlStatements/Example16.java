public class Example16 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int temp = a;
        int rev = 0;
        while(a!=0){
            rev = rev*10 + a%10;
            a/=10;
        }
        if(rev == temp){
            System.out.println(rev + " is a palindrome number!");
        }
        else{
            System.out.println(rev + " is not a palindrome number!");
        }
    }
}
