package tema2;

import org.testng.annotations.Test;

//10. Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;

public class Tema2Part10 {

    @Test
    public void afisamRezultat(){

        sumaCapat(10);
    }

    public void sumaCapat(int capat){
        int sum=0;
        for (int index=0;index<=capat;index++){
            sum=sum+index;
        }
        System.out.println("Suma numerelor de la 1 la "+capat+" este "+sum+'.');
    }
}
