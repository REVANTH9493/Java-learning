class Fruit{
    String name;
    String taste;
    String size;
    Fruit(String name, String taste, String size){
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat(){
        System.out.println("The fruit is very tasty");
    }
}

class Apple extends Fruit{

    Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    void eat(){
        System.out.println("The Apple is very tasty and sweet.");
    }

}

class Orange extends Fruit{

    Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    void eat(String name, String taste){
        System.out.println("The Orange is very sour.");
    }

}


public class Apple_Orange {
    public static void main(String[] args) {
        Apple a = new Apple("apple", "sweet", "small");
        a.eat();
        Fruit o = new Orange("Orange", "Sour", "Small");
        o.eat();
    }
}
