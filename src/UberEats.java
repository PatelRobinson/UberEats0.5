import java.util.Scanner;
public class UberEats {

    public static void main (String [] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("Hello! Welcome to UberEats0.5!");
        System.out.println("These are the returants we currently partner with.");
        System.out.println("Press 1 for Taco Bell");
        System.out.println("Press 2 for McDonald's");
        System.out.println("Press 3 for Pizza Hut");
        System.out.print("Which restaurant would you like to order from? ");
        int choice = scan.nextInt();

           if(choice > 3 || choice < 0){
               while (choice > 3 || choice < 0){
                   System.out.println("Invalid choice.");
                   System.out.println("1: Taco Bell");
                   System.out.println("2: McDonald's");
                   System.out.println("3: Pizza Hut");
                   System.out.print("Which restaurant would you like to order from? ");
                   choice = scan.nextInt();
               }

           }
           else if (choice == 1){
               TacoBellMenu tbmenu = new TacoBellMenu();
               tbmenu.menuTacoBell();
           }
           else if (choice == 2){
               PizzaHutMenu phMenu = new PizzaHutMenu();
               phMenu.PizzaHutMenu();
           }
           else {
           }

    }

}

