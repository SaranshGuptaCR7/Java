class Shape{
    public double getArea(){
        return 0;
    }
}
class Triangle extends Shape{
    int base;
    int height;
    void triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;
     void rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;    
    }
    public double getArea(){
        return length * breadth;
    }
}

class Square extends Shape{
    int side;
    void square(int side){
        this.side = side;
    }
    public double getArea(){
        return side * side;
    }
}

class area{
    public static void main(String[] args){
        Triangle t = new Triangle();
        t.triangle(5, 10);
        System.out.println("Area of triangle = " + t.getArea());

        Rectangle r = new Rectangle();
        r.rectangle(4, 6);
        System.out.println("Area of rectangle = " + r.getArea());

        Square s = new Square();
        s.square(4);
        System.out.println("Area of square = " + s.getArea());
    }
}