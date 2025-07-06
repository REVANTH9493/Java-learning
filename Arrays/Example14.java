import java.util.Arrays;

public class Example14 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        if(args.length<9){
            System.out.println("Please enter 9 integer numbers");
        }
        else{
            int b = 0;
            int big = Integer.parseInt(args[0]);
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a.length; j++){
                    a[i][j] = Integer.parseInt(args[b]);
                    b++;
                }
            }
            for(int c=0; c<args.length; c++){
                if(big<Integer.parseInt(args[c])){
                    big = Integer.parseInt(args[c]);
                }
            }
            System.out.println(Arrays.deepToString(a));
            System.out.println("The biggest number in the given array is: "+big);

        }
    }
}
