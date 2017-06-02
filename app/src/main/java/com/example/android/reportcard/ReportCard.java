package com.example.android.reportcard;

/**
 * Created by Paul on 02/06/2017.
 */

public class ReportCard {


    private int StudentId;

    private String StudentFirstName;

    private String StudentLastName;

    private double MathGrade;

    private double ChemistryGrade;

    private double HistoryGrade;

    private double PhysicsGrade;

    private double GradeAvg;


    public ReportCard(int studentId, String studentFirstName, String studentLastName, double mathGrade, double chemistryGrade, double historyGrade, double physicsGrade) {
        StudentId = studentId;
        StudentFirstName = studentFirstName;
        StudentLastName = studentLastName;
        MathGrade = mathGrade;
        ChemistryGrade = chemistryGrade;
        HistoryGrade = historyGrade;
        PhysicsGrade = physicsGrade;
    }



    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentFirstName() {
        return StudentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        StudentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return StudentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        StudentLastName = studentLastName;
    }

    public double getMathGrade() {
        return MathGrade;
    }

    public void setMathGrade(double mathGrade) {
        MathGrade = mathGrade;
    }

    public double getChemistryGrade() {
        return ChemistryGrade;
    }

    public void setChemistryGrade(double chemistryGrade) {
        ChemistryGrade = chemistryGrade;
    }

    public double getHistoryGrade() {
        return HistoryGrade;
    }

    public void setHistoryGrade(double historyGrade) {
        HistoryGrade = historyGrade;
    }

    public double getPhysicsGrade() {
        return PhysicsGrade;
    }

    public void setPhysicsGrade(double physicsGrade) {
        PhysicsGrade = physicsGrade;
    }

    public double getGradeAvg() {

        GradeAvg =  (MathGrade + HistoryGrade + ChemistryGrade + PhysicsGrade) / 4;
        return GradeAvg;
    }

    @Override
    public String toString() {
        return
                "\nID: " + StudentId +
                "\nFirst name: " + StudentFirstName +
                "\nLast name: " + StudentLastName +
                "\nGrade in Mathematics: " + MathGrade +
                "\nGrade in Chemistry: " + ChemistryGrade +
                "\nGrade in History: " + HistoryGrade +
                "\nAverage: " + getGradeAvg();

    }
}