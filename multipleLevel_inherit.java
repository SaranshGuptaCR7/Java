class Animal{
    void eat(){
        System.out.println("eating...Animal class....eat method");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("Roar..Lion class....roar method");
    }
}
class Babylion extends Lion{
    void weep(){
        System.out.println("Weeping....Babylion class....wee method");
    }
}
class multipleLevel_inherit{
    public static void main(String[] args){
        Babylion obj = new Babylion();
        obj.eat();
        obj.weep();
        obj.roar();
    }
}