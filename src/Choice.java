import java.util.Scanner;
public class Choice {

    public static void choice (int x) {

        Scanner scan = new Scanner(System.in);
        for (int num = 0; num < 4; num++) {

            switch (x) {

                case 1:
                    TacoBellMenu.menuTacoBell();
                    TacoBellPrice.price();
                    num += 5;
                    break;
                case 2:
                    ChickFilA.menuChickFilA();
                    PizzaHutPrice.price();
                    num += 5;
                    break;
                case 3:
                    PizzaHutMenu.PizzaHutMenu();
                    ChickFilAPrice.price();
                    num += 5;
                    break;
                case 4:
                    Randomizer.Randomizer();
                    num += 5;
                    break;
                default:
                    System.out.println("Error, not a choice. Please try again.");
                    x = scan.nextInt();
            }

        }

    }

}
