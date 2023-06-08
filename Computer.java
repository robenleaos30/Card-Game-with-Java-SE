package Day11;

public class Computer
{
    int comCard1;
    int comCard2;
    int comCard3;
    int comCard4;
    int comCard5;
    int comAddCard;
    String cards;

    Computer(int card1, int card2, int card3, int card4, int card5)
    {
        this.comCard1 = card1;
        this.comCard2 = card2;
        this.comCard3 = card3;
        this.comCard4 = card4;
        this.comCard5 = card5;
        this.comAddCard = card1 + card2;
        this.cards = "Day11.Computer cards : " + card1 + ", " + card2;
    }

    void comDraw()
    {
        while (true)
        {
            if ((comCard1 == 1 && comCard2 == 10) || (comCard1 == 10 && comCard2 == 1))
            {
                comAddCard = 101;
                System.out.println(cards);
                break;
            }
            else if (comAddCard >= 17)
            {
                System.out.println(cards);
                break;
            }
            else
            {
                comAddCard += comCard3;
                cards += ", " + comCard3;

                if (comAddCard < 17)
                {
                    comAddCard += comCard4;
                    cards += ", " + comCard4;

                    if (comAddCard < 17)
                    {
                        comAddCard += comCard5;
                        cards += ", " + comCard5;
                    }
                    else
                    {
                        System.out.println(cards);
                        break;
                    }
                }
                else
                {
                    System.out.println(cards);
                    break;
                }
                System.out.println(cards);
                break;
            }

        }

    }
}
