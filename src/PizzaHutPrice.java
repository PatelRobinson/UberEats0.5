//displays the prices of the items based on the choice.
import java.util.Scanner;

public class PizzaHutPrice {

    //The purpose of this method is to calculate the price of the users order based on their input
    //The total price will be caclulate and returned to the user
    public static double price(){

        ResMenus menu = new ResMenus();

        double menuprices[][] = {{2.99, 1.50, 1.50}, {5.99, 6.50, 7.00}, {2.99, 1.50, 3.49}};

        //Establishes the variables needed, such as the onces that will contain the price and the order
        double prices = 0.0;
        Scanner order = new Scanner(System.in);
        System.out.println("Please add items to your order, Enter 'F' to finish");
        String myorder = order.nextLine();
        String yourOrder = "";

        //Takes in the order from the user, as well as the price
        while (!myorder.equalsIgnoreCase("f")) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (menu.Menu(i)[i][j].equalsIgnoreCase(myorder)) {
                        yourOrder = yourOrder + menu.Menu(i)[i][j];
                        prices += menuprices[i][j];

                        System.out.print("The price of the item is: $");
                        System.out.println(menuprices[i][j]);
                        System.out.println("Please add anything else you would like to order. Enter 'F' to finish");

                    }
                }
            }
            myorder= order.nextLine();

        }
        return prices;
    }
}
