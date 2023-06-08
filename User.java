package Day11;

import java.util.Scanner;

public class User
{
    int userCard1;
    int userCard2;
    int userCard3;
    int userCard4;
    int userCard5;
    int userNumber;
    User(int card1, int card2, int card3, int card4, int card5)
    {
        this.userCard1 = card1;
        this.userCard2 = card2;
        this.userCard3 = card3;
        this.userCard4 = card4;
        this.userCard5 = card5;
        this.userNumber = card1 + card2;
    }

    void userDraw()
    {
        Scanner scanner = new Scanner(System.in);

        String user = "Day11.User cards : " + userCard1 + ", " + userCard2;
        System.out.println(user);

        while (true)
        {
            System.out.print("Draw another card ('y' or 'n') : ");
            String nextCard = scanner.nextLine();
            if ((userCard1 == 1 && userCard2 == 10) || (userCard1 == 10 && userCard2 == 1))
            {
                userNumber = 101;
                break;
            }
            else if (nextCard.equals("y"))
            {
                user += ", " + userCard3;
                System.out.println(user);

                System.out.print("Draw another card ('y' or 'n') : ");
                String nextCard1 = scanner.nextLine();
                userNumber += userCard3;

                if (nextCard1.equals("y"))
                {
                    user += ", " + userCard4;
                    System.out.println(user);

                    System.out.print("Draw another card ('y' or 'n') : ");
                    String nextCard2 = scanner.nextLine();
                    userNumber += userCard4;

                    if (nextCard2.equals("y"))
                    {
                        user += ", " + userCard5;
                        System.out.println(user);
                        userNumber += userCard5;
                        break;
                    }
                    else if (nextCard2.equals("n"))
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Wrong type. Please enter again!");
                    }
                }
                else if (nextCard1.equals("n"))
                {
                    break;
                }
                else
                {
                    System.out.println("Wrong type. Please enter again!");
                }
            }
            else if (nextCard.equals("n"))
            {
                break;
            }
            else
            {
                System.out.println("Wrong type. Please enter again!");
            }
        }
    }
}
