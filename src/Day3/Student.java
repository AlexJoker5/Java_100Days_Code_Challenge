package Day3;

import java.util.Arrays;

public class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    Student [] students = {
            new Student("Thidar"),
            new Student("Nilar"),
            new Student("Thandar")
    };

    /*You can sort int, string,...etc.
    But you can't sort Class Object.*/

    //Arrays.sort(students);
}
