import java.util.Scanner;

public class VehicleSpeedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the current gear (0 for Neutral, 1-5 for driving):");
        int gear = sc.nextInt();

        System.out.println("Are the brakes applied? (Enter true or false):");
        boolean isBraking = sc.nextBoolean();

        int speed = 0;
        switch (gear) {
            case 0:
                speed = 0; 
                break;
            case 1:
                speed = 20; 
                break;
            case 2:
                speed = 40; 
                break;
            case 3:
                speed = 60; 
                break;
            case 4:
                speed = 85; 
                break;
            case 5:
                speed = 110; 
                break;
            default:
                System.out.println("Invalid gear selected!");
                sc.close();
                return;
        }
        if (isBraking) {
            speed = speed / 4; 
            System.out.println("Brakes are active! Slowing down...");
        
        System.out.println("-------------------------------------");
        System.out.println("Current Gear: " + gear);
        System.out.println("Brakes Applied: " + isBraking);
        System.out.println("Calculated Speed: " + speed + " km/h");
        System.out.println("-------------------------------------");

        sc.close();
    }
}
}