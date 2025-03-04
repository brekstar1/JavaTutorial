package tema2;

import org.testng.annotations.Test;

//9. Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;

public class Tema2Part9 {

    @Test
    public void afisamRezultat() {

        //suma(235,10);
        suma2(235,10);
        //suma(33.33,10);
        //suma(11.45,0.55);
    }

    public void suma(double nr1, double nr2) {
        double sum = nr1 + nr2;
        System.out.println("Suma celor doua numere este: " + sum);
    }

    public void suma2(int nr3, int nr4) {
        int sum2 = nr3 + nr4;
        System.out.println("Suma celor doua numere este: " + sum2);
    }
}
