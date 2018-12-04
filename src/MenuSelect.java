public class MenuSelect {

    public static void menu(int x, String [][]y){

            if (x == 0) {
                System.out.println("DRINKS");
                System.out.println("------");

                for (int i = 0; i < y[x].length; i++) {

                    System.out.println(y[x][i]);
                }
            } else if (x == 1) {
                System.out.println("ENTREES");
                System.out.println("------");

                for (int i = 0; i < y[x].length; i++) {

                    System.out.println(y[x][i]);
                }
            } else if (x == 2) {
                System.out.println("DESSERT");
                System.out.println("-------");

                for (int i = 0; i < y[x].length; i++) {

                    System.out.println(y[x][i]);
                }
            } else if (x == 3) {
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
