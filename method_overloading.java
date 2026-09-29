class Student{
    int id;
    String name;
    float stipend;
    Student(){}
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    Student(int id, String name, float stipend){
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }
    void displayDetails(){
        System.out.println(this.id + " " + this.name + " " + this.stipend);
    }
}
class method_overloading{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student(91, "Jacky");
        Student s3 = new Student(911, "Osama", 911911);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
} 
