package game;

public class CompareScore
{
    public int compare(String choice, int roundnum)
    {
        Randomizer l = new Randomizer();
        String computerChoice = l.random();

        if (choice.equals(computerChoice))
        {
            System.out.println("You picked: " + choice);
            System.out.println("Computer picked: " + computerChoice);
            System.out.println("You draw round " + (roundnum + 1) +"!");
            return 0;
        }

        if (choice.equals("scissors"))
        {
            if (computerChoice.equals("paper")) {
                System.out.println("You picked: scissors");
                System.out.println("Computer picked: paper");
                System.out.println("You win round " + (roundnum + 1) + "!");
                return 1;
            }

            if (computerChoice.equals("rock")) {
                System.out.println("You picked: scissors");
                System.out.println("Computer picked: rock");
                System.out.println("You lose round " + (roundnum + 1) + "!");
                return -1;
            }
        }

        if (choice.equals("paper"))
        {
            if (computerChoice.equals("scissors")) {
                System.out.println("You picked: paper");
                System.out.println("Computer picked: scissors");
                System.out.println("You lose round " + (roundnum + 1) + "!");
                return -1;
            }

            if (computerChoice.equals("rock")) {
                System.out.println("You picked: paper");
                System.out.println("Computer picked: rock");
                System.out.println("You win round " + (roundnum + 1) + "!");
                return 1;
            }
        }

        if (choice.equals("rock"))
        {
            if (computerChoice.equals("scissors")) {
                System.out.println("You picked: rock");
                System.out.println("Computer picked: scissors");
                System.out.println("You win round " + (roundnum + 1) + "!");
                return 1;
            }

            if (computerChoice.equals("paper")) {
                System.out.println("You picked: rock");
                System.out.println("Computer picked: paper");
                System.out.println("You lose round " + (roundnum + 1) + "!");
                return -1;
            }
        }
        System.out.println("You no type any of the options, try again!!!");

        return 2025;
    }
}
