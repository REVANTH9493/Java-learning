import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {
        int[] arr = {1,9,7,5,3,4,6,8,2,10};
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        // System.out.println(Arrays.toString(arr));
    }
}
