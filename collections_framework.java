import java.util.ArrayList;

class collective_framewrok{
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        System.out.println("=================================Printing Current Array===============================================");
        System.out.println(animals);
        animals.clear();
        System.out.println("=========Printting Cleared Arrays==============");
        System.out.println("Empty Array:" +animals);
        if(animals.isEmpty()){
            System.out.println("array is empty");
        }
        else{
            System.out.println("array is not empty");
        }
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        System.out.println("the size of Array:" +animlas.size());
        System.out.println("Adding more elements" +animals.add("Dog"));
        System.out.println("animals");
        animals.remove(2);
        System.out,println(animals)
    }
}