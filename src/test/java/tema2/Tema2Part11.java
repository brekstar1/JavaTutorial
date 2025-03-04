package tema2;

import org.testng.annotations.Test;

//11. Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;

public class Tema2Part11 {

    @Test
    public void afisamRezultat(){

        inmultireCapat(5);
    }

    public void inmultireCapat(int capat){
        int inmultire=1;
        for (int index=0;index<=capat;index++){
            if (index!=0) {
                inmultire = inmultire * index;
            }
        }
        System.out.println("Rezultatul inmultirii numerelor de la 1 la "+capat+" este "+inmultire+'.');
    }
}
