public class Example8 {
    public static void main(String[] args) {
        switch (args[0]) {
            case "R":
                System.out.println("Red");
                break;
            case "G":
                System.out.println("Green");
                break;
            case "B":
                System.out.println("Blue");
                break;
            case "O":
                System.out.println("Orange");
                break;
            case "Y":
                System.out.println("Yellow");
                break;
            case "W":
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid code");
                break;
        }

    }
}
