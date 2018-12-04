//provides a random menu
import java.util.Random;
class Randomizer {
    //This method uses a random number generator to randomly select an order for
    //The user.
    public static void Randomizer() {

        String chickMenu[][] = {{"Soda", "Lemonade", "Sweet Tea"},{"Chicken Sandwich", "Chicken Nuggets", "Chicken Strips"},{"Ice Cream", "Fruit Bowl", "Milkshake"}};
        String[][] pizzaHutMenu = {{"Soda", "Water", "Juice"}, {"Cheese Pizza", "Pepperoni Pizza", "Chicken Wings"}, {"Chocolate Brownies", "Chocolate Chip Cookies", "Chocolate Cake"}};
        String tacoMenu[][] = {{"Soda", "Water", "Milk"}, {"Taco", "Burrito", "Nachos"}, {"Ice Cream", "Churros", "Cinnamon Twists"}};

        //Randomly selects an option for the resturant and all the items on the menu
        int randRes = (int)(Math.random() * 3 + 1);
        int randDrink = (int)(Math.random() * 3);
        int randMeal = (int)(Math.random() * 3);
        int randDes = (int)(Math.random() * 3);
        String yourOrder = "";

        //If the user gets Chick-Fil-A, this will randomly fill out their order with the rest of the numbers
        if (randRes == 1){

            System.out.println("You randomly got Chick-fil-a, your order is: ");
            yourOrder = chickMenu[0][randDrink] + ", " + chickMenu[1][randMeal] + " and " + chickMenu[2][randDrink];
            System.out.print(yourOrder);
        }
        //If the user gets Pizza Hut, this will randomly fill out their order with the rest of the numbers
        else if (randRes == 2){

            System.out.println("You randomly got Pizza Hut, your order is: ");
            yourOrder = pizzaHutMenu[0][randDrink] + ", " + pizzaHutMenu[1][randMeal] + " and " + pizzaHutMenu[2][randDrink];
            System.out.print(yourOrder);
        }
        //If the user gets Taco Bell, this will randomly fill out their order with the rest of the numbers
        else if (randRes == 3){

            System.out.println("You randomly got Taco Bell, your order is: ");
            yourOrder = tacoMenu[0][randDrink] + ", " + tacoMenu[1][randMeal] + " and " + tacoMenu[2][randDrink];
            System.out.print(yourOrder);
        }

    }
}
