import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {
        int[] arr = {1,10,10,2,3};
        int[] temp = new int[arr.length];
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=10){
                temp[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
