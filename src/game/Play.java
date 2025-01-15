package game;

import java.util.Scanner;

public class Play
{
    int count = 0;
    int totalRounds = 0;
    int sum = 0;

    public Play(int rounds)
    {
        totalRounds = rounds;
    }
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

    public void playing(String choice)
    {
        CompareScore c = new CompareScore();
            int k = c.compare(choice.toLowerCase(), count);
            if (k == 2025)
            {
               return;
            }

            sum += k;
            count += 1;

            if (count < totalRounds)
            {
                return;
            }

            count = 0;

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
