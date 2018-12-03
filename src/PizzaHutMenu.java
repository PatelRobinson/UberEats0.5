import java.util.Scanner;

public class PizzaHutMenu {

    public static void PizzaHutMenu() {

        Scanner scan = new Scanner(System.in);
        String[][] pizzamenu = {{"Soda", "Water", "Juice"},
                                {"Cheese Pizza", "Pepperoni Pizza", "Chicken Wings"},
                                {"Chocolate Brownies", "Chocolate Chip Cookies", "Chocolate Cake"}};
        ResChoice.choice();

        int choices = scan.nextInt();

        MenuSelect.menu(choices, pizzamenu);

    }
}
