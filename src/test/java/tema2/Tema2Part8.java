package tema2;

import org.testng.annotations.Test;

//8. Afisam in consola primele 3 numere dibizibile cu 5;
//Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

public class Tema2Part8 {

    @Test
    public void afisamRezultat() {
        //numereDivizibileCinciPrimele();
        numereDivizibileCinciPrimeleCapat(15);

    }

    public void numereDivizibileCinciPrimele() {
        for (int index = 0; index <= 15; index++) {
            if ((index + 1) % 5 == 0) {
                System.out.print((index + 1) + " ");
            }
        }
    }

    public void numereDivizibileCinciPrimeleCapat(int capat) {
        for (int index = 0; index <= capat; index++) {
            if ((index + 1) % 5 == 0) {
                System.out.print((index + 1) + " ");
            }
        }
    }
}
