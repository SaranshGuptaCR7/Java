class this_keyword{
    int age;
    this_keyword(int age){
        this.age = age;
    }
    public static void main(String[] args){
        this_keyword obj = new this_keyword(20);
        System.out.println("Age is:" + obj.age);
    }
}