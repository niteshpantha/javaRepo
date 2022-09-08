import java.util.ArrayList;
import java.util.Scanner;

public class FirstAssessment {        //this is the main class
    public static String getUnitName(Scanner userInput) {     //this method is used to get the unit name from the user
        String unitName = "";
        do {
            System.out.println("Please enter the unit name: ");
            unitName = userInput.nextLine();
        } while (unitName == "");
        System.out.println("*********************************************************************************");  //this makes the output look beautiful.
        return unitName;
    }
    public static ArrayList<Double> getStudentsMarks(Scanner userInput) {   //this method is used to get the student marks from the user
        ArrayList<Double> studentMarks = new ArrayList<>();       // Declaring an arraylist of type double
        try {                                                    // using try catch for exception handling
            do
            {                                                      // using do-while loop for scanning marks from the users.
                System.out.println("Please enter the marks obtained by the students");
                Double sMarks = userInput.nextDouble();

                if (sMarks > 0 && sMarks < 100) {                     //logic for validating marks between 0 and 100
                    studentMarks.add(sMarks);
                } else {
                    System.out.println("Please enter the valid marks for the students");
                }
            } while (studentMarks.size() != 25);
            System.out.println("*********************************************************************************");
        } catch (Exception e) {
            System.out.println("Invalid data format detected.The program will stop the execution. Please run again. " + e);
            System.exit(0);                 //terminating the program gracefully
        }
        return studentMarks;

    }

    public static void main(String[] args) {                                //main method starts from here.
        FirstAssessment firstAssessment = new FirstAssessment();            //creating an object firstAssessment
        Scanner userInput = new Scanner(System.in);
        String unitName = firstAssessment.getUnitName(userInput);
        ArrayList<Double> studentMarks = firstAssessment.getStudentsMarks(userInput);   //creating an array list for double data type for object firstAssessment
        System.out.println("The unit name is : " + unitName);
        System.out.println("The number of the respective marks obtained by the students are: ");
        studentMarks.forEach(x -> {
            System.out.println(x);
        });
        System.out.println("*********************************************************************************");
        Double highestMarks = studentMarks.get(0);
        Double lowestMarks = studentMarks.get(0);
        for (int i = 0; i < studentMarks.size(); i++) {
            if (highestMarks < studentMarks.get(i)) {       //logic to obtain the highest marks of the students
                highestMarks = studentMarks.get(i);         //logic to obtain the lowest marks of the students
            }
            if (lowestMarks > studentMarks.get(i)) {
                lowestMarks = studentMarks.get(i);
            }
        }
        System.out.println("The highest mark is: " + highestMarks);    //printing the highest marks
        System.out.println("The lowest mark is: " + lowestMarks);      //printing the lowest marks
        System.out.println("*********************************************************************************");
        Double total = 0.0;
        for (int i = 0; i < studentMarks.size(); i++) {
            total += studentMarks.get(i);
        }
        double mean = total / studentMarks.size();      // mean logic
        System.out.println("The mean is :" + mean);
        // https://www.tutorialspoint.com/statistics/individual_series_standard_deviation.htm ---->>>> using this website for the standard deviation logic
        double summation = 0.0;
        for (int i = 0; i < studentMarks.size(); i++) {     //(x-mean)**2
            double intermediateValue = Math.pow((studentMarks.get(i) - mean), 2);
            summation += intermediateValue;
        }
        int divisor = studentMarks.size() - 1;     // N-1
        double nextIntermediateValue = summation / divisor;
        System.out.println("The standard deviation is: " + Math.pow(nextIntermediateValue, 0.5));
        System.out.println("*********************************************************************************");
    }
}
