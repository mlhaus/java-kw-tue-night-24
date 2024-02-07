package edu.kirkwood.week03;

public class IfElse {
    public static void main(String[] args) {
        int x = 10;
        if (x < 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Ternary Operator
        // booleanExpression ? "ValueIfTrue" : "ValueIfFalse"
        System.out.println(x < 20 ? "True" : "False");

        String grade = getGrade(85);
        System.out.println(grade);
        String grade2 = getGrade2(85);
        System.out.println(grade2);
        String grade3 = getGrade3(85);
        System.out.println(grade3);
    } // End main

    public static String getGrade(double score) {
        String result = "";
        if(score >= 90) {
            result = "A";
        } else if(score >= 80) {
            result = "B";
        } else if(score >= 70) {
            result = "C";
        } else if(score >= 60) {
            result = "D";
        } else {
            result = "F";
        }
        return result;
    }

    public static String getGrade2(double score) {
        String result = "";
        if(score < 60) {
            result = "F";
        } else if(score < 70) {
            result = "D";
        } else if(score < 80) {
            result = "C";
        } else if(score < 90) {
            result = "B";
        } else {
            result = "A";
        }
        return result;
    }

    public static String getGrade3(double score) {
        String result = "";
        result = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F";
        return result;
    }


}
