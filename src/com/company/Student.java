package com.company;

public class Student {
    public String name;
    protected String city;
    protected static int age;
    Student() {

    }
    Student (String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    public static void say(){
        System.out.println("Опа");
    }
    public static void majority(){
        if(age >= 18){
            System.out.println("Совершеннолетний");
        } else{
            System.out.println("Несовершеннолетний");
        }
    }
}
