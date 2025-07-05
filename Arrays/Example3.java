public class Example3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int a = Integer.parseInt(args[0]);
        boolean b = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==a){
                System.out.println(i);
                b = true;
            }
        }
        if(!b){
            System.out.println("-1");
        }
    }
}
