import java.util.Scanner;

public class PizzaHutMenu {

    public static void PizzaHutMenu(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Pizza Hut menu.");
        System.out.println("Press 0 to display drinks");
        System.out.println("Press 1 to display entrees");
        System.out.println("Press 2 to display desserts");
        System.out.println("Press 3 to display full menu");

        int choices = scan.nextInt();

        if (choices == 0) {

            System.out.println("DRINKS");
            System.out.println("------");
            System.out.println("Soda");
            System.out.println("Water");
            System.out.println("Juice");

        } else if (choices == 1) {

            System.out.println("ENTRES");
            System.out.println("------");
            System.out.println("Cheese Pizza");
            System.out.println("Pepperoni Pizza");
            System.out.println("Chicken Wings");

        } else if (choices == 2) {

            System.out.println("DESSERT");
            System.out.println("-------");
            System.out.println("Chocolate Brownies");
            System.out.println("Chocolate Chip Cookies");
            System.out.println("Chocolate Cake");

        } else if (choices == 3) {

            System.out.println("DRINKS | ENTRES | DESSERTS");
            System.out.println("Soda");
            System.out.println("Water");
            System.out.println("Juice");
            System.out.println("Cheese Pizza");
            System.out.println("Pepperoni Pizza");
            System.out.println("Chicken Wings");
            System.out.println("Chocolate Brownies");
            System.out.println("Chocolate Chip Cookies");
            System.out.println("Chocolate Cake");
        }
    }
}
