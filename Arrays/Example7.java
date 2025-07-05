import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        int[] arr = {12,34,12,45,67,89};
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int j = 0;
        for(int i=1; i<arr.length; i++){
            if(temp[j] != arr[i]){
                j++;
                temp[j] = arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
