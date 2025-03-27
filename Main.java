import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] quiz ={
            {"What is the capital of France?", "Paris"},
            {"What is the capital of Italy?", "Rome"},
            {"What is the capital of Spain?", "Madrid"},
            {"What is the capital of Germany?", "Berlin"},
            {"What is the capital of Portugal?", "Lisbon"}
        };

        int score = 0;

        for(int i=0; i<quiz.length; i++){
            String question = quiz[i][0];
            String answer = quiz[i][1];

            System.out.println(question);
            Scanner scanner = new Scanner(System.in);
            String userAns = scanner.nextLine();

            if(userAns.equalsIgnoreCase(answer)){
                System.out.println("Bingo! You are correct!");
                score++;
            }else{
                System.out.println("Sorry, you are wrong!");
                System.out.println("The correct answer is: " + answer);
            }
        
        }}
}