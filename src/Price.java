import java.util.Scanner;
public class Price
{
    public static void prices(){

        String chickMenu[][] = {{"soda", "lemonade", "sweet tea"},{"Chicken Sandwhich", "Chicken nuggets", "Chicken strips"},{"ice cream", "fruit bowl", "milkshake"}};
        double menuprices[][]={{1.29, 0.99, 1.50},{4.99, 3.99, 4.59},{2.99, 2.00, 1000.00}};

        double prices = 0;
        Scanner order = new Scanner(System.in);
        System.out.println("Please add items to your order, Enter 'F' to finish");
        String myorder = order.next();

        while (!myorder.equalsIgnoreCase("f")){
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(chickMenu[i][j].equalsIgnoreCase(myorder))
                    {
                        prices = prices + menuprices[i][j];
                    }
                }
            }
            System.out.print("Your order is now : $");
            System.out.println(prices);
            System.out.println("Please add anything else you would like to order. Enter 'F' to finish");
            String myorder = order.next();


        }
    }
}
}
