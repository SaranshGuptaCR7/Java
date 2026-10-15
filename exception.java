import java.util.*;
class exception{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            Systm.out.println("Enter your two numbers");
            int x = sc.nextInt();
            int y =sc.nextInt();
            int z = x / y;
            System.out.println("YOur answer is:" +z);
        }
        catch(ArithmeticException ex){
            System.out.println("----------Catcher block------------");
            System.out.println(ex.toString());
        }
        finally{
            System.out.println("Credits goes to codingal instructor for teaching");
            System.out.println("For rest thank me");
            sc.close();
        }
    }
}