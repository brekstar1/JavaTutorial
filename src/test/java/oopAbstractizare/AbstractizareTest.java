package oopAbstractizare;

import com.beust.ah.A;
import org.testng.annotations.Test;

public class AbstractizareTest {

    @Test
    public void metodaTest(){

        ElevPersoana Obiect1 = new ElevPersoana("Savu","Andrei",26,
                "Caragiale",1);
        Obiect1.infoElev();
        System.out.println();

        AngajatPersoana Obiect2 = new AngajatPersoana("Saru","Andrei",
                26,"Google","5 ani",4500);
        Obiect2.infoAngajat();
        System.out.println();

        ElevAngajat Obiect3 = new ElevAngajat("Sabu","Alex",
                33,"Eminescu",4,"Dell","7 ani",5440);
        Obiect3.infoPersoana();
        System.out.println();
    }
}
