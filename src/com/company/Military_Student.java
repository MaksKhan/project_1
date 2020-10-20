package com.company;

public class Military_Student extends  UniversityStudent{
    public static String zvan;
    Military_Student(String name, String city, int age, String un, int k, int stepend, String zvan){
        super(name, city, age, un, k, stepend);
        this.zvan = zvan;
    }
    public static void dance(){
        if (zvan == "Младший лейтенант"){
            System.out.println(zvan + ", мальчик молодой, все хотят потанцевать с тобой");
        } else{
            System.out.println("Танцевать не хочется");
        }
    }
}
