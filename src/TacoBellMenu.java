//displays the taco bell menu
import java.util.Scanner;
public class TacoBellMenu {
    public static void menuTacoBell() {

        //This is the method for the menu of Taco Bell
        //It contains the menu and uses it as a references to call the menu select method to fill out the order
        ResMenus menu = new ResMenus();

        //Establishes the menu for Taco Bell
        System.out.println("Welcome to the Taco Bell menu.");

        //Displays the menu for the user and takes in a value that they select for the restaurant
        ResChoice.choice();
        Scanner menuList = new Scanner(System.in);

        int menuSelect = menuList.nextInt();

        MenuSelect.menu(menuSelect, menu.Menu(0,0));

    }
}
