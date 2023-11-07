package src;

public class Rectangle {
    int width;
    int lenght;
    public void setWidthAndLength(int w, int l){
        this.width = w;
        this.lenght = l;
    }
    public int getWidth(){
        return width;
    }
    public int getLenght(){
        return lenght;
    }
    public int area(int w, int l){
        int arie;
        return arie = w*l;
    }
    public int perimeter(int w, int l){
        int perimetru;
        return perimetru = 2*w + 2*l;
    }
}

