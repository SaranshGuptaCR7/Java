import java.util.*;
public class Main{
    public static Candidate getCandidateDetails() throws
    InvalidInterException{
        Scanner sc = nee Scanner(system.in);
        System.out.println("Name");
        String name = sc.next();
        System.out.println("Gender");
        String gender = sc.next();
        System.out.println("Percentage in 10th");
        int percenatge = sc.nextInt();

        if (percentage < 50) {
            throw new InvalidInterException("Registration failed Son! U registered in the wrong country try to register in India and do EXCEPTIONALLY GOOD WORK");
            else{
                Candidate candidate = new Candidate();
                candidate.setName(name);
                candidate.setGender(gender);
                candidate.setPercentage(percenatge);

                return candidate:
            }
        }
        public static void main(String[] args){
            System.out.println("Welcome to Inter Hiring Tool for Netas");
            try{
                Cabdidate candidate = getCandidateDetails();
                System.out.println("Registeration Successfull Son!");
            }
            catch(InvalidInterException e){
                System.out.println(e.getMessage());
            }
        }
    }
}