class Parent{
    public static void sayHello(){
        System.out.println("Hello from Parent");
    }
}
class Child extends Parent{
    @Override
    public void sayHello(){
        System.out.println("Hello from child");
    }
}
class method_overWritting{
    public static void main(String[] args){
        Parent p = new Child();
        p.sayHello();
    }
}
