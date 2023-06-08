package Day11;

public class Calculation
{
    int userNum;
    int computerNum;
    Calculation(int userCardNum, int computerCardNum)
    {
        this.userNum = userCardNum;
        this.computerNum = computerCardNum;
    }

    void calculate()
    {
        if (userNum == 101 && computerNum == 101)
        {
            System.out.println("\n" + "It's a draw!");
        }
        else if (userNum == 101)
        {
            System.out.println("\n" + "Day11.User is blackjack. Day11.User win!");
        }
        else if (computerNum == 101)
        {
            System.out.println("\n" + "Day11.Computer is blackjack. Day11.Computer win!");
        }
        else if ((userNum > 21) && (computerNum > 21))
        {
            System.out.println("\n" + "It a draw!");
        }
        else if (userNum > 21)
        {
            System.out.println("\n" + "Day11.Computer win!");
        }
        else if (computerNum > 21)
        {
            System.out.println("\n" + "Day11.User win!");
        }
        else if ((userNum > computerNum) && (userNum < 21))
        {
            System.out.println("\n" + "Day11.User win!");
        }
        else if ((computerNum > userNum) && (computerNum < 21))
        {
            System.out.println("\n" + "Day11.Computer win!");
        }
        else if (userNum == computerNum)
        {
            System.out.println("\n" + "It a draw!");
        }
    }
}
