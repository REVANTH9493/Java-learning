class Animals{
    public void Eat(){
        System.out.println("Its Eating.....");
    }
    public void Sleep(){
        System.out.println("Its Sleeping.....");
    }

}
class Bird extends Animals{ 
    public void Fly(){
        System.out.println("It's Flying....");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animals a = new Animals();
        a.Eat();
        a.Sleep();
        Bird b = new Bird();
        b.Eat();
        b.Sleep();
        b.Fly();
    }    
}
