package com.company;

public class UniversityStudent extends Student {
    public static String un;
    public static int k;
    public static int stepend;
    UniversityStudent(String name, String city, int age, String un, int k, int stepend){
        super(name, city, age);
        this.un = un;
        this.k = k;
        this.stepend = stepend;
    }
    public static void graduation(){
        System.out.println(5 - k);
    }
    public static void bigStepend(){
        if (stepend > 3000){
            System.out.println("Большая стипендия");
        } else{
            System.out.println("Обычная стипендия");
        }
    }

}
