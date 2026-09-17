import java.util.*;
class Main{
    public static void main(String[] args){
        int sum=0;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Subjects:");
        int noOfSubjects = sc.nextInt();
        int marks[] = new int[noOfSubjects];
        System.out.println("Enter the marks of" +noOfSubjects + "Subjects.Press Enter to give marks for another subject Son!");
        for(int i=0; i< noOfSubjects; i++){
            marks[i] = sc.nextInt();
        }
        int percentage = sum / noOfSubjects;
        System.out.println(percentage);
        if(percentage >= 100) {
            result = "Son! U Scored the marks that most asian parents need Good! DO it again to show that u really are good in studies";
        }
        else if(percentage > 90 && percentage < 95) {
            result = "Son! u did good for the first time now do better in next time";
        }
        else{
            result = "Son! I even doubt did the teacher got some mercy for you because u were failing in the exam. U got lucky man";
        }
        System.out.println(result);
    }
}