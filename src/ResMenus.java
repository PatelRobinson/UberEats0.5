//This class is used to create the menus for each restaurant to be reused.
public class ResMenus {

    private String chickMenu[][] = {{"Soda", "Lemonade", "Sweet Tea"},
            {"Chicken Sandwich", "Chicken Nuggets", "Chicken Strips"},
            {"Ice Cream", "Fruit Bowl", "Milkshake"}};
    private String[][] pizzamenu = {{"Soda", "Water", "Juice"},
            {"Cheese Pizza", "Pepperoni Pizza", "Chicken Wings"},
            {"Chocolate Brownies", "Chocolate Chip Cookies", "Chocolate Cake"}};
    private String tacoMenu[][] = {{"Soda", "Water", "Milk"},
            {"Taco", "Burrito", "Nachos"},
            {"Ice Cream", "Churros", "Cinnamon Twists"}};

    //creats overload methods for each restaurants
    public String [][] Menu(){

        return chickMenu;
    }
    public String [][] Menu( int x){

        return pizzamenu;
    }
    public String [][] Menu( int x, int y){

        return tacoMenu;
    }
}
