import game.Play;

/*
Rock Paper Scissors
Rules:
-3 rounds
computer randomly picks rock, paper, or scissors
-automaticllly wins if you or the computer get 2 wins in a row
-finds out who won at the end
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello gitgoggergamer!");
        Play p = new Play(3);
        p.playing();
    }
}