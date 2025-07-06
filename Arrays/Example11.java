public class Example11 {
    public static void main(String[] args) {
        int[] arr = {1,1,4,4};
        boolean a = true;
        for(int i:arr){
            if((i==1)||(i==4)){
                a = true;
            }
            else{
                a = false;
            }
        }
        System.out.println(a);
    }
}