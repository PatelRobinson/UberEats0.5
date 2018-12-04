import java.util.Scanner;
class ChickFilA {
    public static void menuChickFilA() {

        String chickMenu[][] = {{"Soda", "Lemonade", "Sweet Tea"},
                                {"Chicken Sandwich", "Chicken Nuggets", "Chicken Strips"},
                                {"Ice Cream", "Fruit Bowl", "Milkshake"}};

        System.out.println("Welcome to the ChickFilA menu.");
        ResChoice.choice();
        Scanner menuList = new Scanner(System.in);

        int menuSelect = menuList.nextInt();

        MenuSelect.menu(menuSelect, chickMenu);

    }
}
