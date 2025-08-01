class shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
    void erase(){
        System.out.println("Erasing Shape");
    }
}

class circle extends shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
    void erase(){
        System.out.println("Erasing Circle");
    }
}

class Triangle extends shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }
    void erase(){
        System.out.println("Erasing Triangle");
    }
}

class Square extends shape{
    void draw(){
        System.out.println("Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Square");
    }
}

public class Draw {
    public static void main(String[] args) {
        shape a = new circle();
        shape b = new Square();
        shape c = new Triangle();
        a.draw();
        b.draw();
        c.draw();
        a.erase();
        b.erase();
        c.erase();
    }    
}
