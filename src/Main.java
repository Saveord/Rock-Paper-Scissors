import java.util.Scanner;

/*
Rock Paper Scissors
Rules:
-3 rounds
computer randomly picks rock, paper, or scissors
-automaticllly wins if you or the computer get 2 wins in a row
-finds out who won at the end
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello gitgoggergamer!");
        System.out.println("Enter rock, paper, or scissors:");
        Scanner myObj = new Scanner(System.in);
        String choice = myObj.nextLine();
        CompareScore c = new CompareScore();
        c.compare(choice);
    }
}