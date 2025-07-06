import java.util.Arrays;

public class Example12 {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,3};
        int[] b = {4,5,4,5,6,7,7,8,6};
        int[] c = {a[((a.length-1)/2)],b[((b.length)/2)]};
        System.out.println(Arrays.toString(c));
    }
}
