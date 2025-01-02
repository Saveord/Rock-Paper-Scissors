import java.util.Scanner;

public class Play
{
    public void playing()
    {
        int sum = 0;
        CompareScore c = new CompareScore();
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Enter rock, paper, or scissors:");
            Scanner myObj = new Scanner(System.in);
            String choice = myObj.nextLine();
            int k = c.compare(choice.toLowerCase(), i);
            if (k == 2025)
            {
                i -= 1;
                continue;
            }
            sum += k;
        }
        if (sum == 0)
        {
            System.out.println("Draw");
        }
        else if (sum > 0)
        {
            System.out.println("YOU WINNNN!!");
        }
        else
        {
            System.out.println("YOU LOSEEEE! :(((");
        }
    }
}
