package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {
    @Test
    public void testMethod(){
        Elev Andrei = new Elev("Savu","Andrei",26);
        Andrei.infoElev();
        System.out.println();

        Elev Alice = new Elev("Malina","Alice",24);
        Alice.infoElev();
        System.out.println();

        System.out.println(Elev.getScoala());
    }
}
