package obiectConstructor;

import org.testng.annotations.Test;

public class MasinaTest {

    @Test
    public void metodaTest(){
        Masina Toyota = new Masina("Toyota","Coralla","1600",2024,35000);
        Toyota.prezentareMasina();
        System.out.println();

        Masina Dacia = new Masina("Dacia",2024,"1400","Logan");
        Dacia.prezentareMasina();
    }
}
