public class Example1{
    public static void main(String[] args){
        int[] newarray = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i=0; i<newarray.length; i++){
            sum = sum + newarray[i];
        }
        System.out.println("The sum of elements in the array are: "+sum);
        System.out.println("The average of the elements of the array are: "+sum/newarray.length);
    }
}