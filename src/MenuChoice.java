//Gives the users options to choose a restaurant
import java.util.Scanner;
public class MenuChoice {

    public static void menu (){

        System.out.println("Please choose a restaurant: ");
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();

        Choice.choice(c);


    }
}
