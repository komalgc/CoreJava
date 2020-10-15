public class matrixexample {


    public static void main(String[] args) {

        int abc[][] = {{7, 9, 5}, {8, 3, 12}, {8, 4, 88}};

        /*
         7 9 5
         8 3 12
         8 4 88
                 */



        int min = abc[0][0];
        int mincolumn = 0;


        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc[0].length; j++) {

                // System.out.println(" the index values are " + a[i][j] );

                if (abc[i][j] < min) {
                    min = abc[i][j];
                    mincolumn = j;

                }



            }
            int k= 0;

            int max = abc[0][mincolumn];
            while(k<3){

                if (abc[k][mincolumn]>max){

                    max = abc[k][mincolumn];

                }
                k++;
            }
            System.out.println("the max value is " + max);


        }



    }

}
