class Main {
    public static void main(String[] args) {

        int year = 2024;

        String result = (year % 400 == 0) ? "Leap year" : "Not leap year";

        System.out.println(result);
    }
}