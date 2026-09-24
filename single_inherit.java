class Parent{
    int age, id;
    String name;
    void naming(String name){
        System.out.println("Name:" + name);
    }
}
class Child extends Parent{
    void ageN(int age){
        System.out.println("Age:" + age);
    }
}
class single_inherit{
    public static void main(String[] args) {
        Child s = new Child();
        s.naming("Aanish");
        s.ageN(20);
    }
}        