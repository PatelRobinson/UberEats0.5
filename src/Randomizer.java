import java.util.Random;

class Randomizer {
    public static void main(String[] args) {

        String chickMenu[][] = {{"soda", "lemonade", "sweet tea"},{"Chicken Sandwhich", "Chicken nuggets", "Chicken strips"},{"ice cream", "fruit bowl", "milkshake"}};
        String[][] menu = {{"Soda", "Water", "Juice"},
                {"Cheese Pizza", "Pepperoni Pizza", "Chicken Wings"},
                {"Chocolate Brownies", "Chocolate Chip Cookies", "Chocolate Cake"}};
        String tacoMenu[][] = {{"soda", "water", "milk"}, {"taco", "burrito", "enchillada"}, {"ice cream", "churro", "something"}};

        int randRes = (int)Math.random() * 3 + 1;
        int randDrink = (int)Math.random() * 3;
        int randMeal = (int)Math.random() * 3;
        int randDes = (int)Math.random() * 3;
        String yourOrder = "";
//test
        if (randRes == 1){

            System.out.println("You randomly got Chick-fil-a, your order is: ");
            yourOrder = chickMenu[0][randDrink] + ", " + chickMenu[1][randMeal] + " and " + chickMenu[2][randDrink];

        }
        else if (randRes == 2){

            System.out.println("You randomly got Pizza Hut, your order is: ");
            yourOrder = menu[0][randDrink] + ", " + menu[1][randMeal] + " and " + menu[2][randDrink];

        }
        else if (randRes == 3){

            System.out.println("You randomly got Taco Bell, your order is: ");
            yourOrder = tacoMenu[0][randDrink] + ", " + tacoMenu[1][randMeal] + " and " + tacoMenu[2][randDrink];
        }

    }
}
