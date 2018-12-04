//displays the main menu
public class MainMenu {
    //This is the the method that establishes the begining of the program by creating a list of resturants
    //And taking in the one that the user wants to use.
    public static void menu (){

        String menu [][] = new String[6][2];

        //Creates the array that the lists or resturants exists in
        menu[0][0] = "Welcome to ";
        menu[0][1] = "UberEats0.5!";

        menu[1][0] = "-------";
        menu[1][1] = "-------";

        menu[2][0] = "1: ";
        menu[2][1] = "Taco Bell";

        menu[3][0] = "2: ";
        menu[3][1] = "ChickFilA";

        menu[4][0] = "3: ";
        menu[4][1] = "Pizza Hut";

        menu[5][0] = "4: ";
        menu[5][1] = "Surprise me!(Special deal: Total is $5.00)";

        //Prints out each part of the resturant in the proper order.
        for (int row = 0; row < menu.length; row++){
            for(int column = 0; column <menu[row].length; column++ ){
                System.out.print(menu[row][column]);
            }
            System.out.println("");
        }
    }
}
