package utils;

import models.Student;

import java.util.ArrayList;

public class CalculateMarksAndDisplay {
    public ArrayList<Student> calMark(ArrayList<Student> studentRecords) {            //this method is used to calculate the total marks
        ArrayList<Student> sRecords = new ArrayList<>();
        for (int i = 0; i < studentRecords.size(); i++) {
            Student sRecord = studentRecords.get(i);
            double totalMarks = sRecord.getFirstSubMark() + sRecord.getSecondSubMark() + sRecord.getThirdSubMark();
            sRecord.setTotalMarks(totalMarks);
            sRecords.add(sRecord);
        }
        return sRecords;
    }

    public void displayMarks(ArrayList<Student> studentsWithTotalMarks) {           //this method is used to display marks.
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("FirstName\t\t\t\t\t  " + "LastName\t\t\t\t\t\t" + "Student Id\t\t" + "First Assessment\t\t" + "Second Assessment\t\t" + "Third Assessment\t" + "Total Marks");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < studentsWithTotalMarks.size(); i++) {
            Student student = studentsWithTotalMarks.get(i);
            System.out.printf("%-30s %-30s %-15s %-25s %-25s %-15s %-15s\n", student.getFirstName(), student.getLastName(), student.getIdNumber(), student.getFirstSubMark(), student.getSecondSubMark(), student.getThirdSubMark(), student.getTotalMarks());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void displayLessMarksThanThresHold(ArrayList<Student> studentsWithTotalMarks, double lessThreshold) {        //this method is used to display student marks within some threshold.
        System.out.println("\n---------------------------------------------------------Students Securing Total Marks Less Than " + lessThreshold + "---------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("FirstName\t\t\t\t\t  " + "LastName\t\t\t\t\t\t" + "Student Id\t\t" + "First Assessment\t\t" + "Second Assessment\t\t" + "Third Assessment\t" + "Total Marks");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < studentsWithTotalMarks.size(); i++) {
            Student student = studentsWithTotalMarks.get(i);
            if (student.getTotalMarks() < lessThreshold) {
                System.out.printf("%-30s %-30s %-15s %-25s %-25s %-15s %-15s\n", student.getFirstName(), student.getLastName(), student.getIdNumber(), student.getFirstSubMark(), student.getSecondSubMark(), student.getThirdSubMark(), student.getTotalMarks());
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void displayTopTenLowestMarks(ArrayList<Student> studentsWithTotalMarks) {                  //this method is used to display lowest marks of ten students
        System.out.println("\n--------------------------------------------------------------Students Securing Lowest Marks-----------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("FirstName\t\t\t\t\t  " + "LastName\t\t\t\t\t\t" + "Student Id\t\t" + "First Assessment\t\t" + "Second Assessment\t\t" + "Third Assessment\t" + "Total Marks");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            Student student = studentsWithTotalMarks.get(i);
            System.out.printf("%-30s %-30s %-15s %-25s %-25s %-15s %-15s\n", student.getFirstName(), student.getLastName(), student.getIdNumber(), student.getFirstSubMark(), student.getSecondSubMark(), student.getThirdSubMark(), student.getTotalMarks());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void displayTopTenHighestMarks(ArrayList<Student> studentsWithTotalMarks) {                  //this method is used to display highest marks of ten students
        System.out.println("\n--------------------------------------------------------------Students Securing Highest Marks-----------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("FirstName\t\t\t\t\t  " + "LastName\t\t\t\t\t\t" + "Student Id\t\t" + "First Assessment\t\t" + "Second Assessment\t\t" + "Third Assessment\t" + "Total Marks");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = (studentsWithTotalMarks.size()-1); i > (studentsWithTotalMarks.size()-11); i--) {
            Student student = studentsWithTotalMarks.get(i);
            System.out.printf("%-30s %-30s %-15s %-25s %-25s %-15s %-15s\n", student.getFirstName(), student.getLastName(), student.getIdNumber(), student.getFirstSubMark(), student.getSecondSubMark(), student.getThirdSubMark(), student.getTotalMarks());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }
}


