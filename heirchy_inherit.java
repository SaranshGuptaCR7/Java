class Mammals{
    void mam(){
        System.out.pritnln("Inside Mammals Class");
    }
}
class Lion extends Mammals{
    void roar(){
        System.out.println("Inside Lion Class");
    }
}
class Human extends Lion{
    void hum(){
        System.out.println("Inside Human Class");
    }
}
class heirchy_inherit{
    public static void main(String[] args){
        Human obj = new Human();
        obj.mam();
        obj.roar();
        obj.hum();
    }
}