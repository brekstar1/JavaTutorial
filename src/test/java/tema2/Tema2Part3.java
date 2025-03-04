package tema2;

import org.testng.annotations.Test;

//3. Afisam in consola numarul cel mai mare dintre 15 si 20;
//Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

public class Tema2Part3 {

    @Test
    public void afisamRezultat(){
        afisamNrMare(15,20);
        //afisamNrMare(20,15);
        //afisamNrMare(15,15);

    }
    public void afisamNrMare(int a,int i){
        if (a==i){
            System.out.println("Cele doua numere sunt egale.");
        }else if (a<i){
            System.out.println("Numarul mai mare este: "+i);
        }else System.out.println("Numarul mai mare este: "+a);
    }
}
