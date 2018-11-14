import java.util.Scanner;
public class TacoBellMenu {
    public static void menuTacoBell() {

        String tacoMenu[][] = {{"soda", "water", "milk"}, {"taco", "burrito", "enchillada"}, {"ice cream", "churro", "something"}};

        ResChoice.choice();
        Scanner menuList = new Scanner(System.in);

        int menuSelect = menuList.nextInt();

        MenuSelect.menu(menuSelect, tacoMenu);
    }
}
