public class multiarrayexample {

    public static void main(String[] args) {

        int a[][] = {{7, 9, 5}, {8, 3, 12}, {8, 4, 88}};

        /*
         7 9 5
         8 3 12
         8 4 88
                 */
        int min = a[0][0];
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                // System.out.println(" the index values are " + a[i][j] );

                if (a[i][j] < min) {
                    min = a[i][j];
                }

            }

        }


        System.out.println("the min value is " + min);


        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a[0].length; y++) {

                // System.out.println(" the index values are " + a[i][j] );

                if (a[x][y] > max) {
                    max = a[x][y];
                }

            }

        }


        System.out.println("the min value is " + max);
    }
}
