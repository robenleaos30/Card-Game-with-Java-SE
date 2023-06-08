package Day11;

import java.util.Random;


class Tools
{
    int[] cards = new int[]{10, 10, 10, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int choice()
    {
        Random random = new Random();
        return cards[random.nextInt(cards.length)];
    }
    int card1 = choice();
    int card2 = choice();
    int card3 = choice();
    int card4 = choice();
    int card5 = choice();
    int card11 = choice();
    int card22 = choice();
    int card33 = choice();
    int card44 = choice();
    int card55 = choice();

}


public class Main
{
    public static void main(String[] args)
    {
        Tools tools = new Tools();
        User user = new User(tools.card1, tools.card2, tools.card3, tools.card4, tools.card5);
        Computer computer = new Computer(tools.card11, tools.card22, tools.card33, tools.card44, tools.card55);
        user.userDraw();
        computer.comDraw();
        Calculation calculation = new Calculation(user.userNumber, computer.comAddCard);
        calculation.calculate();
    }
}