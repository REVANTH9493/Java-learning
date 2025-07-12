public class Pin {
    public static void main(String[] args) {
        int d = 123; 
        int e = 456;
        int f = 789;
        int a = 0;
        int b = 0;
        int c = 0;
        int temp = 0;
        int result = 0;
        int max = 0;
        int last = 0;
        while(d!=0){
        a = d%10;
        b = e%10;
        c = f%10;
        d /= 10;
        e /= 10;
        f /= 10;
        temp = a<b?(a<c)?a:c:(b<c)?b:c;
        result = result*10 + temp;
        temp = a>b?(a>c)?a:c:(b>c)?b:c;
        max = max>temp?max:temp;
        }
        result = result*10 + max;
        while(result != 0){
            last = last*10 + result%10;
            result/=10; 
        }

        System.out.println(last);
    }
    
}

