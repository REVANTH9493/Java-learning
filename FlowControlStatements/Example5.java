public class Example5 {
    public static void main(String[] args) {
        int c = 1;
        char d = (char) (c+'0');
        int a = d;
        char b = '&';
        // int a = b;
        if(a<58 && a>47){
            System.out.println("Number");
        }
        else if((a>64 && a<91)||(a>96 && a<123)){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Special Character");
        }
    }
}
