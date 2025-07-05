public class Example6 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("There is no input command line argument");
        }
        else{
            int a = Integer.parseInt(args[1]);
            if((args[0].equals("male")) && a < 59){
                System.out.println("The percentage of interest is 8.4%");
            }
            else if((args[0].equals("male")) && a>58 && a < 100){
                System.out.println("The percentage of interest is 10.5%");
            }
            else if((args[0].equals("female")) && a < 58){
                System.out.println("The percentage of interest is 8.2%");
            }
            else if((args[0].equals("female")) && a>58 && a < 100){
                System.out.println("The percentage of interest is 9.2%");
            }
        }
    }
}
