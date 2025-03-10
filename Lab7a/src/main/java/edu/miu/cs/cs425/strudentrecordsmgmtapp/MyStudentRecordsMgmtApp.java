package edu.miu.cs.cs425.strudentrecordsmgmtapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {

//        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//
        MyStudentRecordsMgmtApp app = new MyStudentRecordsMgmtApp();
//        Student[] students = {
//                new Student("110001", "Dave", LocalDate.parse("11/18/1951", dateFormatter)),
//                new Student("110002", "Anna", LocalDate.parse("12/07/1990", dateFormatter)),
//                new Student("110003", "Erica", LocalDate.parse("01/31/1974", dateFormatter)),
//                new Student("110004", "Carlos", LocalDate.parse("08/22/2009", dateFormatter)),
//                new Student("110005", "Bob", LocalDate.parse("08/05/1994", dateFormatter))
//        };
//
//
//        System.out.println("All Alumni");
//        app.printListOfStudents(students);
//
//        System.out.println("\nPlatinum Alumni");
//        app.getListOfPlatinumAlumniStudents(students).forEach(System.out::println);
        app.printHelloWorld(new int[]{5, 2, 14, 43, 10,35});

    }

    public void printListOfStudents(Student[] students) {
        Arrays.stream(students).sorted(Comparator.comparing(Student::getName))
                .toList().forEach((System.out::println));
    }


    public List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        return Arrays.stream(students)
                .filter(Student::isPlatinumAlumniStudent)
                .sorted((student1, student2) -> student1.getDateOfAdmission().compareTo(student2.getDateOfAdmission()))
                .toList();
    }


    public void printHelloWorld(int[] arr) {


        for (int j : arr) {
            if (j % 5 == 0 && j % 7 == 0) {
                System.out.println("HelloWorld");
            }
            else if (j % 5 == 0) System.out.println("Hello");
            else if (j % 7 == 0) System.out.println("World");
        }
    }


}
