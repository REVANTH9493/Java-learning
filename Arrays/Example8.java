public class Example8 {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;
        int temp = 0;
        int[] arr = {10,3,6,1,2,7,9};
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 6){
                x = i;
            }
            if(arr[i] == 7){
                y = i;
            }
        }
        for(int j=0; j<arr.length; j++){
            if((x != 100 && y != 100)&&(x<y)){
                if((j<x)||(j>y)){
                    temp = temp + arr[j];
                }
            }
            else{
                temp = temp + arr[j];
            }
        }
        System.out.println("The sum is: "+temp);
    }
}
