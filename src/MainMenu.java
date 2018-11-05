import java.util.Scanner;
public class MainMenu {

    public static void menu (){

        String menu [][] = new String[5][2];

        menu[0][0] = "Welcome to ";
        menu[0][1] = "UberEats0.5!";

        menu[1][0] = "-------";
        menu[1][1] = "-------";

        menu[2][0] = "1: ";
        menu[2][1] = "Taco Bell";

        menu[3][0] = "2: ";
        menu[3][1] = "ChichFilA";

        menu[4][0] = "3: ";
        menu[4][1] = "Pizza Hut";

        for (int row = 0; row < menu.length; row++){
            for(int column = 0; column <menu[row].length; column++ ){
                System.out.print(menu[row][column]);
            }
            System.out.println("");
        }

        System.out.println("Please choose a resturant: ");
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();

        Choice choice = new Choice();
        Choice.choice(c);


    }
}
