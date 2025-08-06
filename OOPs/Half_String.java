public class Half_String {
    public static void main(String[] args) {
        String a = "revanthn";
        if(a.length()%2!=0){
            System.out.println("Null");
        }
        else{
            a = a.substring(0, a.length()/2);
            System.out.println(a);
        }
    }
}
