import java.util.Random;

public class Randomizer
{
    public String random()
    {
        String[] arr = {"rock", "paper", "scissors"};
        Random r = new Random();
        int randomNumber = r.nextInt(arr.length);
        return arr[randomNumber];
    }
}
