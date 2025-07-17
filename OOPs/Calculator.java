import java.util.*;


public class Calculator {
    public static void main(String[] args){
        int value = 0;
        Cal c = new Cal();
        int d = c.powerInt(12, 13);
        double e = c.powerDouble(12, 15);
        System.out.println("Output for powerInt is: "+ d + " Output for powerDouble is: "+ e);
    }
}

class Cal{
    public static int powerInt(int a, int b){
        int c = (int) Math.pow(a,b);
        return c;
    }

    public static double powerDouble(double a, int b){
        double c = Math.pow(a,b);
        return c;
    }
}