import java.util.Scanner;
class ChickFilA {
    public static void menuChickFilA() {

        String chickMenu[][] = {{"soda", "lemonade", "sweet tea"}, {"Chicken Sandwhich", "Chicken nuggets", "Chicken strips"}, {"ice cream", "fruit bowl", "milkshake"}};

        System.out.println("Welcome to the ChickFilA menu.");
        ResChoice.choice();
        Scanner menuList = new Scanner(System.in);

        int menuSelect = menuList.nextInt();

        MenuSelect.menu(menuSelect, chickMenu);

    }
}
