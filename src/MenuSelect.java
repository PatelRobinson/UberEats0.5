//based on the user selection, this displays the part of the menu
public class MenuSelect {

    //This method is for the sole purpose of printing the topic
    //The user selected, whether it be drinks, entrees or deserts.
    //It prints the type of food and all the available items from
    //The selected resturant
    public static void menu(int x, String [][]y){
        //Prints the drinks of the resturant of their choosing
        if (x == 0) {
                System.out.println("DRINKS");
                System.out.println("------");

                for (int i = 0; i < y[x].length; i++) {

                    System.out.println(y[x][i]);
                }
            }
        //Prints the entrees of the resturant of their choosing
        else if (x == 1) {
                System.out.println("ENTREES");
                System.out.println("------");

                for (int i = 0; i < y[x].length; i++) {

                    System.out.println(y[x][i]);
                }
            }
        //Prints the desserts of the resturant of their choosing
        else if (x == 2) {
                System.out.println("DESSERT");
                System.out.println("-------");

                for (int i = 0; i < y[x].length; i++) {

                    System.out.println(y[x][i]);
                }
            }
        //If the user desires the entire menu, this will print
        //Every item in the menu that is available.
        else if (x == 3) {
                System.out.println("DRINKS | ENTREES | DESSERTS");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        System.out.print(y[j][i]);
                        System.out.print("    ");
                    }
                    System.out.println();
                }
            }

    }
}
