package oop;

import org.testng.annotations.Test;

import java.util.Arrays;

public class OOPTest {
    @Test
    public void testMethod() {
        RangeRover andreiSport = new RangeRover("Range Rover", "Sport",
                "negru", 2023, Arrays.asList("Aer conditionat", "Geamuri electrice", "Oglinzi incalzite"));
        andreiSport.infoRangeRover();
        andreiSport.pornesteMasina();
        andreiSport.promotie();
        System.out.println();

        RangeRover alexSport = new RangeRover("Range Rover", "Sport",
                "negru", 2023, 35000, Arrays.asList("Aer conditionat", "Geamuri electrice", "Oglinzi incalzite"));
        alexSport.infoRangeRover();
        alexSport.promotie(5);

        System.out.println();

        Audi andreiA3 = new Audi("Audi", "A3", "albastru", 2024,
                Arrays.asList("Oglinzi incalzite","Geamuri electrice"), Arrays.asList("Navigatie", "Scaune incalzite"));
        andreiA3.infoAudi();
        andreiA3.pornesteMasina();
        System.out.println();

        Audi alexA3 = new Audi("Audi", "A3", "albastru", 2024, 48000,
                Arrays.asList("Oglinzi incalzite","Geamuri electrice"), Arrays.asList("Navigatie", "Scaune incalzite"));
        alexA3.infoAudi();
        alexSport.setCuloare("Rosu");
        System.out.println();
        System.out.println(alexSport.getCuloare());
        System.out.println(alexSport.getPret());
        alexSport.infoRangeRover();

    }
}
