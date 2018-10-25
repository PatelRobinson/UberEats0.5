import java.util.Scanner;
public class TacoBellMenu {
    public static void menuTacoBell() {

        String tacoMenu[][] = {{"soda", "water", "milk"}, {"taco", "burrito", "enchillada"}, {"ice cream", "churro", "something"}};

        System.out.println("Welcome to the taco bell menu.");
        System.out.println("Press 0 to display drinks");
        System.out.println("Press 1 to display entres");
        System.out.println("Press 2 to display desserts");
        System.out.println("Press 3 to display full menu");

        Scanner menuList = new Scanner(System.in);

        int menuSelect = menuList.nextInt();

        if (menuSelect == 0) {

            System.out.println("DRINKS");
            System.out.println("------");
            for (int i = 0; i < tacoMenu[menuSelect].length; i++) {

                System.out.println(tacoMenu[menuSelect][i]);
            }
        } else if (menuSelect == 1) {

            System.out.println("ENTRES");
            System.out.println("------");
            for (int i = 0; i < tacoMenu[menuSelect].length; i++) {

                System.out.println(tacoMenu[menuSelect][i]);
            }
        } else if (menuSelect == 2) {

            System.out.println("DESSERT");
            System.out.println("-------");
            for (int i = 0; i < tacoMenu[menuSelect].length; i++) {

                System.out.println(tacoMenu[menuSelect][i]);
            }
        } else if (menuSelect == 3) {


            System.out.println("DRINKS | ENTRES | DESSERTS");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    System.out.print(tacoMenu[j][i]);
                    System.out.print("    ");
                }
                System.out.println();
            }
        }
    }
}
