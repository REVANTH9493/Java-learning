class Box {
    int w;
    int h;
    int d;
    Box(int width, int height, int depth){
        w = width;
        h = height;
        d = depth;
    }

    int CalculateVolume(int w, int h, int d){
        this.w = w;
        this.h = h;
        this.d = d;
        int volume = w*h*d;
        return volume;
    }
}


public class Container {
    public static void main(String[] args){
        int w = 10;
        int h = 9;
        int d = 8;
        Box box = new Box(w,h,d);
        int vol = box.CalculateVolume(w,h,d);
        System.out.println(vol);
    }
}
