package com.company;

public class Schooler extends Student {
    public static int k;
    public static double marks;
    Schooler(String name, String city, int age, int k, double marks ){
        super(name, city, age);
        this.k = k;
        this.marks = marks;
    }
    public static void exams(){
        System.out.println("Лет до экзамена: " + (12 - k));
    }
    public static void isExcellentStudent(){
        if (marks == 5.0) {
            System.out.println("Отличник");
        } else{
            System.out.println("Явно не отличник");
        }
    }
}
