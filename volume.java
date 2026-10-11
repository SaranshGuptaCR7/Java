class Shape{
    public double getVolume(){
        return 0;
    }
}
class Cube extends Shape{
    int side;

    void cube(int side){
        this.side = side;
    }
    public double getVolume(){
        return side * side * side;
    }
}

class Cuboid extends Shape{
    int length;
    int breadth;
    int height;
     void cuboid(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;    
        this.height = height;
    }
    public double getVolume(){
        return length * breadth * height;
    }
}

class Cylinder extends Shape{
    int radius;
    int height;
    void cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    public double getVolume(){
        return Math.PI * radius * radius * height;
    }
}

class volume{
    public static void main(String[] args){
        Cube c = new Cube();
        c.cube(5);
        System.out.println("Volume of cube = " + c.getVolume());

        Cuboid cb = new Cuboid();
        cb.cuboid(4, 6, 8);
        System.out.println("Volume of cuboid = " + cb.getVolume());

        Cylinder cy = new Cylinder();
        cy.cylinder(3, 5);
        System.out.println("Volume of cylinder = " + cy.getVolume());
    }
}