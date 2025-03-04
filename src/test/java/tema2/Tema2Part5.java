package tema2;

import org.testng.annotations.Test;

//5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");

public class Tema2Part5 {

    @Test
    public void afisamRezultat() {
        numerePareImpare(10);

    }

    public void numerePareImpare(int capat) {
        int a = 1;
        for (int index = 0; index < capat; index++) {
            System.out.print((a + index) + " ");
        }
    }
}
