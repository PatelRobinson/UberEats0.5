import java.util.Scanner;
public class TacoBellMenu {
    public static void menuTacoBell() {

        String tacoMenu[][] = {{"soda", "water", "milk"}, {"taco", "burrito", "nachos"}, {"ice cream", "churro", "something"}};

        System.out.println("Welcome to the Taco Bell menu.");
        ResChoice.choice();
        Scanner menuList = new Scanner(System.in);

        int menuSelect = menuList.nextInt();

        MenuSelect.menu(menuSelect, tacoMenu);

    }
}
