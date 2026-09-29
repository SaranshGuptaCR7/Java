class Superclass{
    int number = 56;
}
class Subclass extends Superclass{
        int number = 911;
        void printnumber(){
            System.out.println(super.number);
        }
}
class super{
    public static void main(String[] args){
        Subclass sub = new Subclass();
        sub.printnumber();
    }
}