//displays the chickfila menu
import java.util.Scanner;
class ChickFilA {
    //This is the method for the menu of Chick-fil-a
    //It contains the menu and uses it as a references to call the menuselect method to fill out the order
    public static void menuChickFilA() {

        //Establishes the string for the menu of Chick-fil-a
        ResMenus menu = new ResMenus();

        System.out.println("Welcome to the ChickFilA menu.");

        //Displays the menu for the user and takes in a value that they select for the resturant
        ResChoice.choice();
        Scanner menuList = new Scanner(System.in);


        int menuSelect = menuList.nextInt();

        MenuSelect.menu(menuSelect, menu.Menu());

    }
}
