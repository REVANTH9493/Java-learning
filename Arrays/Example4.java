public class Example4 {
    public static void main(String[] args) {
        // int[] arr = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
        int[] arr = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = i+65;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print((char) arr[i] + " ");
        }
    }
}
