interface MyInterface{
    public void method1();
    public void method2();
}

class I implements MyInterface{
    public void method1(){
        System.out.println("Implementation of method 1");
    }
    public void method2(){
    System.out.println("Implementation of method 2");
    }

public static void main(String[] args){
    MyInterface obj = new I();
    obj.method1();
    obj.method2();
}
}