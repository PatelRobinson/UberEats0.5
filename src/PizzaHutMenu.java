//displays the pizza hut menu
import java.util.Scanner;

public class PizzaHutMenu {

    //This is the method for the menu of Pizza Hut
    //It contains the menu and uses it as a references to call the menuselect method to fill out the order
    public static void PizzaHutMenu() {

        Scanner scan = new Scanner(System.in);

        //Establishes the menu for pizza hut
        ResMenus menu = new ResMenus();

        //Displays the menu for the user and takes in a value that they select for the restaurant
        ResChoice.choice();

        int choices = scan.nextInt();

        MenuSelect.menu(choices, menu.Menu(0));

    }
}
