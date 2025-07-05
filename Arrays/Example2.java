public class Example2 {
    public static void main(String[] args) {
        int[] array = {1,29,38,47,54,65};
        int max, min = 0;
        max = array[0];
        min = array[5];
        for(int i=0; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
            }
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("The max term is "+max+" and the min term is "+min);
    }
}
