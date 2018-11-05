import java.util.Scanner;
public class Choice {

    public static void choice (int x) {


        for (int num = 0; num < 3; num++) {

            switch (x) {

                case 1:
                    TacoBellMenu.menuTacoBell();
                    num += 4;
                    break;
                case 2:
                    ChickFilA.menuChickFilA();
                    num += 4;
                    break;
                case 3:
                    PizzaHutMenu.PizzaHutMenu();
                    num += 4;
                    break;
                default:
                    System.out.println("Error, not a choice. Please try again.");

            }

        }

    }

}
