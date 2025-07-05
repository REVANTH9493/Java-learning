public class Example5 {
    public static void main(String[] args) {
        int max1, max2, min1, min2 =0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        max1 = arr[0];
        max2 = arr[0];
        min1 = arr[14];
        min2 = arr[14];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            if(arr[arr.length - 1 - i]<min1){
                min2 = min1;
                min1 = arr[arr.length - 1 - i];
            }
        }
        System.out.println("max1 = "+max1+", max2 = "+max2+", min1 = "+min1+", min2 = "+min2);
    }
}
