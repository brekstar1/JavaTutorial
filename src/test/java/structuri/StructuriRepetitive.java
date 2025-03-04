package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //Structuri Repetitive: FOR, WHILE

    @Test
    public void metodaTest() {
        //afisareNrFOR(50);
        //afisareNrFORDESC(50);
        //afisamNrPare();
        afisamNrPareV2();

    }

    //Afisam primele N numere
    public void afisareNrFOR(int capat) {
        for (int index = 0; index <= capat; index++) {
            System.out.println("Numarul afisat este: " + index);
        }
    }

    //Afisam Nr While
    public void afisareNrWhile(int capat) {
        int index = 0;
        while (index <= capat) {
            System.out.println("Numarul afisat este: " + index);
            index++;
        }
    }

    public void afisareNrFORDESC(int capat) {
        for (int index = capat; index >= 0; index--) {
            System.out.println("Numarul afisat este: " + index);
        }
    }

    //Afisam numerele pare de la 0 la 50
    public void afisamNrPare() {
        for (int index = 0; index <= 50; index = index + 2) {
            System.out.println("Numarul par este: " + index);
        }
    }

    public void afisamNrPareV2() {
        for (int index = 0; index <= 50; index++) {
            if (index % 2 == 0) {
                System.out.println("Numarul par este: " + index);
            }
        }
    }


}
