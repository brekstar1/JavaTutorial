package tema2;

import org.testng.annotations.Test;

//7. Afisam in consola numerele divizibile cu 5;
//Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

public class Tema2Part7 {

    @Test
    public void afisamRezultat(){

        //numereDivizibileCinci(50,44);
        numereDivizibileCinciCapat(55);
    }

    public void numereDivizibileCinci(int nr1,int nr2){
        if (nr1%5==0){
            System.out.println("Numarul "+nr1+" este divizibil cu 5.");
        }
        if (nr2%5==0){
            System.out.println("Numarul "+nr2+" este divizibil cu 5.");
        }
    }

    public void numereDivizibileCinciCapat(int capat){
        System.out.print("Numerele divizibile cu 5 sunt: ");
        int a=1;
        for (int index=0;index<=capat;index++){
            if (index%5==0){
                System.out.print(index+" ");
            }
        }
    }
}
