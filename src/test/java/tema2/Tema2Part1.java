package tema2;

import org.testng.annotations.Test;

//1. Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre

public class Tema2Part1 {

    @Test
    public void afisamRezultate(){
        afisamDa(5);
        primeleTreiNumere(3);
        //primeleTreiNumere(4);
        afisamNrMare(15,20);
        //afisamNrMare(20,15);
        //afisamNrMare(15,15);
        afisamMaiMic(4.5,3.25);
        afisamMaiMic(3.25,4.5);
        afisamMaiMic(4.5,4.5);
        numerePareImpare(10);
        //numerePare(10);
        numerePareV2(10);
        //numereDivizibileCinci(50,44);
        numereDivizibileCinciCapat(55);
        //numereDivizibileCinciPrimele();
        numereDivizibileCinciPrimeleCapat(15);
        //suma(235,10);
        suma2(235,10);
        //suma(33.33,10);
        //suma(11.45,0.55);
        sumaCapat(10);
        inmultireCapat(5);

    }

    public void afisamDa(int capat){
        for (int index=0;index<=capat;index++){
            System.out.print("DA"+' ');
        }
    }

    public void primeleTreiNumere(int capat){
        int a=1;
        for (int index=0;index<capat;index++){
            System.out.print((a+index)+" ");
        }
    }

    public void afisamNrMare(int a,int i){
        if (a==i){
            System.out.println("Cele doua numere sunt egale.");
        }else if (a<i){
            System.out.println("Numarul mai mare este: "+i);
        }else System.out.println("Numarul mai mare este: "+a);
    }

    public void afisamMaiMic(double a, double i){
        if (a==i){
            System.out.println("Cele doua numere sunt egale.");
        } else if (a>i) {
            System.out.println("Numarul mai mic este: "+i);
        }else System.out.println("Numarul mai mic este: "+a);
    }

    public void numerePareImpare(int capat) {
        int a = 1;
        for (int index = 0; index < capat; index++) {
            System.out.print((a + index) + " ");
        }
    }

    public void numerePare(int capat){
        int a=1;
        for (int index=0;index<capat;index++){
            if ((a+index)%2==0){
                System.out.print((a+index)+" ");
            }
        }
    }

    public void numerePareV2(int capat){
        int a=2;
        for (int index=0;index<capat;index=index+2){
            System.out.print((index+a)+" ");
        }
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

    public void suma(double nr1, double nr2) {
        double sum = nr1 + nr2;
        System.out.println("Suma celor doua numere este: " + sum);
    }

    public void suma2(int nr3, int nr4) {
        int sum2 = nr3 + nr4;
        System.out.println("Suma celor doua numere este: " + sum2);
    }

    public void sumaCapat(int capat){
        int sum=0;
        for (int index=0;index<=capat;index++){
            sum=sum+index;
        }
        System.out.println("Suma numerelor de la 1 la "+capat+" este "+sum+'.');
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
