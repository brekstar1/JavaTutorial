package tema2;

import org.testng.annotations.Test;

//4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25;
//Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

import java.sql.SQLOutput;

public class Tema2Part4 {

    @Test
    public void afisamRezultat(){

        afisamMaiMic(4.5,3.25);
        afisamMaiMic(3.25,4.5);
        afisamMaiMic(4.5,4.5);

    }

    public void afisamMaiMic(double a, double i){
        if (a==i){
            System.out.println("Cele doua numere sunt egale.");
        } else if (a>i) {
            System.out.println("Numarul mai mic este: "+i);
        }else System.out.println("Numarul mai mic este: "+a);
    }
}
