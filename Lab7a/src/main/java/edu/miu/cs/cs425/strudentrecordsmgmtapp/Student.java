package edu.miu.cs.cs425.strudentrecordsmgmtapp;


import java.time.LocalDate;
import java.time.Year;


public class Student {

    private String name;
    private String studentId;
    private LocalDate dateOfAdmission;

    public Student(String studentId, String name, LocalDate dateOfAdmission) {
        this.name = name;
        this.studentId = studentId;
        this.dateOfAdmission = dateOfAdmission;
    }

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }


    public boolean isPlatinumAlumniStudent() {

        int admissionYear = dateOfAdmission.getYear();
        int currentYear = LocalDate.now().getYear();

        return (currentYear - admissionYear) >= 30;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", dateOfAdmission=" + dateOfAdmission +
                '}';
    }
}
