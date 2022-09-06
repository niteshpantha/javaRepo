import java.util.Scanner;

public class MyProg1 {
    public static void main(String[] args) {
        Double[] housePrices = new Double[11];  //Declaring the array of type-double of size 10
        Scanner scanHouse = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {     //getting the houseprice from the input through users
            System.out.println("Please enter the " + i + " no. house price");
            housePrices[i] = scanHouse.nextDouble();
        }
        System.out.println();
        //printing the house price
        for (int i = 1; i <= 10; i++  ) {
            System.out.println("The price of " + i + " house is " + housePrices[i] );

        }
        System.out.println();

//        Change the code to print only numbers greater than 500k
        for (int i = 1; i <= 10; i++  ) {
            if (housePrices[i] > 500000) {
                System.out.println( "The house prices more than 500k are : " + housePrices[i]);

            }
        }
        System.out.println();

        double total = 0;
        for (int i = 1; i <= 10; i++  ) {
            total += housePrices[i];
        }
        System.out.println("The average price calculated: " + (total/10));
        System.out.println();
        double min = housePrices[1];
        double max = housePrices[1];
        for (int i = 1; i <= 10; i++  ) {
            if (max > housePrices[i]) {
                max = housePrices[i];
            }
            if (min <housePrices[i]) {
                min = housePrices[i];
            }

        }
        System.out.println();
        System.out.println("The maximum price is :" + max);
        System.out.println();
        System.out.println("The minimum price is :" + min);


    }
}
