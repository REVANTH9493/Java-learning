import java.util.Arrays;

public class Example13 {
    public static void main(String[] args) {
        if(args.length < 4){
            System.out.println("Please enter four elements");
        }
        else{
            int[][] a = new int[args.length/2][args.length/2];
            a[0][0] = Integer.parseInt(args[3]);
            a[0][1] = Integer.parseInt(args[2]);
            a[1][0] = Integer.parseInt(args[1]);
            a[1][1] = Integer.parseInt(args[0]);
            for(int i=0;i<a.length;i++){
                for(int j=0; j<a.length; j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }   
        }
    }
}
