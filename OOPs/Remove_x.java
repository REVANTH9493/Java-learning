public class Remove_x {
    public static void main(String[] args) {
        String a = "Revanthx";
        if (a.charAt(0)=='x' && a.charAt(a.length()-1)=='x'){
            a= a.substring(1, a.length()-1);
            System.out.println(a);
        }
        else{
            System.out.println(a);
        }
    }
}
