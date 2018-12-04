import java.util.Scanner;
public class Choice {
    //This method determines which resturant the user wants to eat at based on the input that they give.
    //Returns an error if the user does not give a proper integer
    public static void choice (int x) {

        //Loops through each choice for orders and sides
        Scanner scan = new Scanner(System.in);
        for (int num = 0; num < 5; num++) {

            switch (x) {
                //If the user inputs 1 It will bring up the taco bell menu and ask the user for their order
                //Calls the price method to caclulate the price of their order
                case 1:
                    TacoBellMenu.menuTacoBell();
                    System.out.println("Your total is: " + TacoBellPrice.price());
                    num += 5;
                    break;
                //If the user inputs 2 It will bring up the taco bell menu and ask the user for their order
                //Calls the price method to caclulate the price of their order
                case 2:
                    ChickFilA.menuChickFilA();
                    System.out.println("Your total is: " + ChickFilAPrice.price());
                    num += 5;
                    break;
                //If the user inputs 3 It will bring up the taco bell menu and ask the user for their order
                //Calls the price method to caclulate the price of their order
                case 3:
                    PizzaHutMenu.PizzaHutMenu();
                    System.out.println("Your total is: " + PizzaHutPrice.price());
                    num += 5;
                    break;
                //calls the randomizer for a random resturant with a random menu
                case 4:
                    Randomizer.Randomizer();
                    num += 5;
                    break;
                //If the user does not input a proper integer it will swing an error and try again
                default:
                    System.out.println("Error, not a choice. Please try again.");
                    x = scan.nextInt();
            }

        }

    }

}
