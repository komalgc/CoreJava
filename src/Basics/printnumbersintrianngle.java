package Basics;

public class printnumbersintrianngle {


    public  static void main (String[] args){

        int k = 1;

        for ( int i =0; i<4 ; i++){

            for (int j=0; j<4-i; j++) {

                System.out.print(k);

                System.out.print("\t");
                k++;
            }

            System.out.println("");


            }
        printnumbersintrianngle p = new printnumbersintrianngle();
     //   p.reverse();
        p.threetable();
        }


       public void reverse(){

int a =1;

           for ( int x =1; x<6 ; x++){
              // int a =1;
         for (int y=1 ; y<x ; y++)

         {

             System.out.print(a);
             System.out.print("\t");
             a++;

         }

               System.out.println("");


           }


       }



       public void threetable (){

        for (int i =1 ; i<15; i++){
            System.out.println("started");


            for (int j=3; j<=2+i; j=j+3){

                System.out.print(j);
                System.out.print("\t");




            }
            System.out.println("");
            System.out.println("finished");
        }

       }


    }

