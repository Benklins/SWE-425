package edu.miu.cs.cs425.strudentrecordsmgmtapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        MyStudentRecordsMgmtApp app = new MyStudentRecordsMgmtApp();
        Student[] students = {
                new Student("110001", "Dave", LocalDate.parse("11/18/1951", dateFormatter)),
                new Student("110002", "Anna", LocalDate.parse("12/07/1990", dateFormatter)),
                new Student("110003", "Erica", LocalDate.parse("01/31/1974", dateFormatter)),
                new Student("110004", "Carlos", LocalDate.parse("08/22/2009", dateFormatter)),
                new Student("110005", "Bob", LocalDate.parse("08/05/1994", dateFormatter))
        };


//        System.out.println("\nAll Alumni");
//        app.printListOfStudents(students);

        System.out.println("\nPlatinum Alumni");
        System.out.println(app.getListOfPlatinumAlumniStudents(students));
//        app.printHelloWorld(new int[]{5, 2, 14, 43, 10, 35});
//        System.out.println(app.findSecondBiggest(new int[]{19, 9, 11, 0, 12}));

    }

    public void printListOfStudents(Student[] students) {
        System.out.println(Arrays.stream(students).sorted(Comparator.comparing(Student::getName))
                .toList());

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
            } else if (j % 5 == 0) System.out.println("Hello");
            else if (j % 7 == 0) System.out.println("World");
        }
    }


    public int findSecondBiggest(int[] arr) {
        int biggest = Integer.MIN_VALUE;
        int secondBiggest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i < biggest && i > secondBiggest) secondBiggest = i;
            if (i > biggest) {
                secondBiggest = biggest;
                biggest = i;
            }
        }
        return secondBiggest;

    }


}
