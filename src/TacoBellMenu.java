import java.util.Scanner;
public class TacoBellMenu {
    public static void menuTacoBell() {

        String tacoMenu[][] = {{"Soda", "Water", "Milk"},
                               {"Taco", "Burrito", "Nachos"},
                               {"Ice Cream", "Churros", "Cinnamon Twists"}};

        System.out.println("Welcome to the Taco Bell menu.");
        ResChoice.choice();
        Scanner menuList = new Scanner(System.in);

        int menuSelect = menuList.nextInt();

        MenuSelect.menu(menuSelect, tacoMenu);

    }
}
