import java.util.Scanner;

public class PizzaHutPrice {

    public static double price(){

        String[][] pizzamenu = {{"Soda", "Water", "Juice"},
                                {"Cheese Pizza", "Pepperoni Pizza", "Chicken Wings"},
                                {"Chocolate Brownies", "Chocolate Chip Cookies", "Chocolate Cake"}};
        double menuprices[][] = {{1.29, 0.99, 1.50}, {4.99, 3.99, 4.59}, {2.99, 2.00, 3.99}};

        double prices = 0.0;
        Scanner order = new Scanner(System.in);
        System.out.println("Please add items to your order, Enter 'F' to finish");
        String myorder = order.nextLine();
        String yourOrder = "";

        while (!myorder.equalsIgnoreCase("f")) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (pizzamenu[i][j].equalsIgnoreCase(myorder)) {
                        yourOrder = yourOrder + pizzamenu[i][j];
                        prices += menuprices[i][j];

                        System.out.print("Your order is now : $");
                        System.out.println(menuprices[i][j]);
                        System.out.println("Please add anything else you would like to order. Enter 'F' to finish");

                    }
                }
            }
            String twoOrder = order.nextLine();
            myorder = twoOrder;
        }
        return prices;

    }
}
