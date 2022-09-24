package utils;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import models.Student;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class CsvReader{
    public ArrayList<Student> readCsvFile(String fileName){                    //this function is used to read csv file
        ArrayList<Student> studentRecords = new ArrayList<>();
        try{
            FileReader filereader = new FileReader(fileName);
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withSkipLines(2)
                    .build();
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
               Student student = getStudentRecord(row);
                studentRecords.add(student);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return studentRecords;
    }

    private Student getStudentRecord(String[] rowData) {                            //this method is used to get the student records
        Student student = new Student();
        for(int i = 0; i < rowData.length; i++){
            if(rowData[i].isBlank() || rowData[i].isEmpty() || rowData[i] == null){        //checking if the row is null or empty
                continue;
            }

            switch (i){
                case 0:
                    student.setLastName(rowData[0]);
                    break;
                case 1:
                    student.setFirstName(rowData[1]);
                    break;
                case 2:
                    student.setIdNumber(rowData[2]);
                    break;
                case 3:
                    student.setFirstSubMark(Double.parseDouble(rowData[3]));
                    break;
                case 4:
                    student.setSecondSubMark(Double.parseDouble(rowData[4]));
                    break;
                case 5:
                    student.setThirdSubMark(Double.parseDouble(rowData[5]));
                    break;
            }
        }
        return student;
    }

}