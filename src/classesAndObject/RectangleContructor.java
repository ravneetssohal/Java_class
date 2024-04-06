package classesAndObject;

public class RectangleContructor {
    int length;
    int width;

    RectangleContructor(){

    }

    RectangleContructor(int length, int width){
        this.length = length;
        this.width =width;
    }

    RectangleContructor(int length){
        this.length = length;
    }

    public int area(){
        return length * width;
    }

    public  int parameter(){
        return 2 * (length + width );
    }
}
