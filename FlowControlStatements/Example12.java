public class Example12 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=10; i<100; i++){
            for(int j=1; j<50; j++){
                if(i%j == 0){
                    count++;
                }
                if(count>1){
                    break;
                }
            }
            if(count<2){
                System.out.println(i);
            }
            count =0;
        }
    }
}
