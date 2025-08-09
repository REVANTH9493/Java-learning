public class Short_long_short {

    public static String sls(String a, String b){
            if(a.length()<b.length()){
                return a+b+a;
            }
            else{
                return b+a+b;
            }
            
        }
        public static void main(String[] args) {
            System.out.println(sls("Revanth","N"));
    }
}
