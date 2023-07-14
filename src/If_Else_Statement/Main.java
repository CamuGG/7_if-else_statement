package If_Else_Statement;

public class Main {
    public static void main(String[] args) {
        String myName = "Simone";
        int numberLettersMyName = myName.length();

        if(numberLettersMyName % 2 == 0){
            System.out.println("the number of letters in my name is even");
        } else {
            System.out.println("the number of letters in my name is odd");
        }
    }
}
