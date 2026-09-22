class Main{
    public static void mian(String[] args){
        String first = "COd";
        String second = "ingal";
        String codingal = first + second;
        String codingalTrick = "welcome" + " to" + "Codingal";
        String codingalCapital = codingal.toUpperCase();
        String codinaglSmall = codingalCapital.toLowerCase();

        int lengthOfCodingal = codingal.length();
        int lengthOfCodingalTrick = codingalTrick.length();
        int sum = lengthOfCodingal + lengthOfCodingalTrick;

        System.out.println(codingal);
        System.out.println(codingalTrick);
        System.out.println(codingalCapital);
        System.out.println(codingalSmall);
        System.out.println(sum);
    }
}