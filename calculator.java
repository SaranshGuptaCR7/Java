import java.util.*;

class Calculation{
    int a;
    int b;
    String operation;
    String result;

    void details(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number:");
        a = sc.nextInt();

        System.out.println("Enter your second number:");
        b = sc.nextInt();

        System.out.println("Choose your operation: Addition, Subtraction, Multiplication, Division, Square");
        sc.nextLine();
        operation = sc.nextLine();
    }
}

    class Format extends Calculation{

        void calculate(){

            if (operation.equals("Addition")){
                result = "Your sum is: " + (a + b);
            }
            else if (operation.equals("Subtraction")){
                result = "Your difference is: " + (a - b);
            }
            else if (operation.equals("Multiplication")){
                result = "Your product is: " + (a * b);
            }
            else if (operation.equals("Division")){
                result = "Your quotient is: " + (a / b);
            }
            else if (operation.equals("Square")){
                result = "Your square is: " + (a * a);
            }
    }
}

class calculator{
    public static void main(String[] args){
        Format f = new Format();
        f.details();
        f.calculate();
        System.out.println(f.result);
    }
}