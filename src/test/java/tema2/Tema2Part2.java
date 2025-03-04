package tema2;

import org.testng.annotations.Test;

//2. Afisam in consola primele 3 numere de la 1 la 3

public class Tema2Part2 {

    @Test
    public void afisamRezultate(){

        primeleTreiNumere(3);
        //primeleTreiNumere(4);

    }

    public void primeleTreiNumere(int capat){
        int a=1;
        for (int index=0;index<capat;index++){
            System.out.print((a+index)+" ");
        }
    }
}
