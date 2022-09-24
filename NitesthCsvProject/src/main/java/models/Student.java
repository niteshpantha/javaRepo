package models;

import java.util.Comparator;                             //for comparing student marks

public class Student {                                   //pojo class to hold the student information
    private String firstName;
    private String lastName;
    private String idNumber;
    private double firstSubMark;
    private double secondSubMark;
    private double thirdSubMark;

    private double totalMarks;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getFirstSubMark() {
        return firstSubMark;
    }

    public void setFirstSubMark(double firstSubMark) {
        this.firstSubMark = firstSubMark;
    }

    public double getSecondSubMark() {
        return secondSubMark;
    }

    public void setSecondSubMark(double secondSubMark) {
        this.secondSubMark = secondSubMark;
    }

    public double getThirdSubMark() {
        return thirdSubMark;
    }

    public void setThirdSubMark(double thirdSubMark) {
        this.thirdSubMark = thirdSubMark;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public static class SortByStudentTotalMarks implements Comparator<Student> {
        public int compare(Student a, Student b)
        {

            return (int) (a.getTotalMarks() - b.getTotalMarks());
        }
    }

    @Override               //for printing
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", firstSubMark=" + firstSubMark +
                ", secondSubMark=" + secondSubMark +
                ", thirdSubMark=" + thirdSubMark +
                ", totalMarks=" + totalMarks +
                '}';
    }
}

