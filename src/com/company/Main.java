package com.company;

public class Main {
    public static void main(String[] args) {
        Schooler Mark = new Schooler("Марк", "Волгоград", 15, 10, 4.6);
        Mark.majority();
        Mark.exams();
        Mark.isExcellentStudent();
        UniversityStudent Max = new UniversityStudent("Максим", "Москва", 20, "МГУ", 1, 3500);
        Max.graduation();
        Max.bigStepend();
        Military_Student Andrew = new Military_Student("Andrew","Санкт-Петербург", 21, "какое-то", 2, 5000, "Младший лейтенант");
        Military_Student.graduation();
        Military_Student.dance();


    }
}
