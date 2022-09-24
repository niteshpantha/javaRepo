
import models.Student;
import utils.CalculateMarksAndDisplay;
import utils.CsvReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                                                                                  // creating an input class sc
        CsvReader csvReader = new CsvReader();                                                                                                // creating an csvReader class
        ArrayList<Student> studentsRecords = csvReader.readCsvFile("nitesh.csv");                            //passing a filename to a method for reading csv file- readCsvFile
        CalculateMarksAndDisplay calculateTotalMarksAndDisplay = new CalculateMarksAndDisplay();                                            //creating an object to calculate marks and display
        ArrayList<Student> studentsWithTotalMarks = calculateTotalMarksAndDisplay.calMark(studentsRecords);                                //passing a parameter studentRecords
        int wantToContinue = 1;                                                                                                            //creating a menu scene
        do {
            System.out.println("\nEnter which of the operation would you like.");
            System.out.println("Enter 1 for Displaying Total Marks.");
            System.out.println("Enter 2 for Displaying students less than provided Threshold.");
            System.out.println("Enter 3 for Displaying ten students having lowest marks.");
            System.out.println("Enter 4 for Displaying ten students having highest marks.");
            int operationType = sc.nextInt();
            switch (operationType) {                                                                                                        //using switch operation
                case 1:
                    calculateTotalMarksAndDisplay.displayMarks(studentsWithTotalMarks);
                    wantToContinue = printOrExit();
                    break;
                case 2:
                    System.out.println("\n Please Enter the Less Threshold Total Marks!!!");
                    double lessThreshold = sc.nextDouble();
                    calculateTotalMarksAndDisplay.displayLessMarksThanThresHold(studentsWithTotalMarks, lessThreshold);
                    wantToContinue = printOrExit();
                    break;
                case 3:
                    Collections.sort(studentsWithTotalMarks, new Student.SortByStudentTotalMarks());                                            // sorting the data
                    calculateTotalMarksAndDisplay.displayTopTenLowestMarks(studentsWithTotalMarks);
                    wantToContinue = printOrExit();
                    break;
                case 4:
                    Collections.sort(studentsWithTotalMarks, new Student.SortByStudentTotalMarks());
                    calculateTotalMarksAndDisplay.displayTopTenHighestMarks(studentsWithTotalMarks);
                    wantToContinue = printOrExit();
                    break;
                default:
                    System.out.println("Sorry! Out of Option!!! ");
            }
        } while (wantToContinue != 0);

    }

    private static int printOrExit() {                   // this method is used to ask the user whether to continue the program or not (0 is used to exit and other numbers are used to perform particular function)
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you Want to Continue... '0' for no, and yes for other numbers.");
        return sc.nextInt();
    }
}
