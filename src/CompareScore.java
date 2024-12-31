public class CompareScore
{
    public void compare(String choice)
    {
        int roundnum = 0;
        Randomizer l = new Randomizer();
        String computerChoice = l.random();

        if (choice.equals(computerChoice))
        {
            System.out.println("You picked: " + choice);
            System.out.println("Computer picked: " + computerChoice);
            System.out.println("You draw round " + (roundnum + 1) +"!");
            return;
        }

        if (choice.equals("scissors"))
        {
            if (computerChoice.equals("paper"))
            {
                System.out.println("You picked: scissors");
                System.out.println("Computer picked: paper");
                System.out.println("You win round " + (roundnum + 1) +"!");
            }

            if(computerChoice.equals("rock"))
            {
                System.out.println("You picked: scissors");
                System.out.println("Computer picked: rock");
                System.out.println("You lose round " + (roundnum + 1) +"!");
            }
        }
    }
}
