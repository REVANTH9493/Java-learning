public class Example10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] temp = new int[arr.length];
        int a = 0;
        int b = arr.length -1;
        for(int i:arr){
            if(i%2==0){
                temp[a]=i;
            }
            else{
                temp[b]=i;
            }
        }
        System.out.println();
    }
}
