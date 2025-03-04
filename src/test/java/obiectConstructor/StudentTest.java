package obiectConstructor;

import org.testng.annotations.Test;

public class StudentTest {

    @Test
    public void testMethod() {
        Student Andrei = new Student("Savu", "Andrei", 26, "IT School", 2);
        Andrei.prezentareStudent();

        System.out.println();

        Student Razvan = new Student("Jude", "Razvan", 29, "IT School", 2);
        Razvan.prezentareStudent();
        System.out.println();

        Razvan.varsta = 39;
        Razvan.an= 3;
        Razvan.prezentareStudent();


        System.out.println();

        Student Alex = new Student("Dorha","Alex",30);
        Alex.prezentareStudent();

        System.out.println();

        Alex.varsta = 31;
        Alex.facultate = "IT School";
        Alex.an = 1;
        Alex.prezentareStudent();
    }
}
