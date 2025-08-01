import java.util.*;

public class GarbageRemover {
    public static void main(String[] args) throws Exception {
        Runtime rs = Runtime.getRuntime();
        System.out.println("Free memory in JVM before Garbage collection is: "+rs.freeMemory());
        rs.gc();
        System.out.println("Free memory in JVM after Garbage collection is:  "+ rs.freeMemory());

    }
}
