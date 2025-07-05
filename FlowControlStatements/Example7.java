public class Example7 {
    public static void main(String[] args) {
        char a = 'z';
        if(Character.isLowerCase(a)){
            System.out.println(a+"->"+Character.toUpperCase(a));
        }
        else{
            System.out.println(a+"->"+Character.toLowerCase(a));
        }
    }
}
