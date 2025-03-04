package tema2;

import org.testng.annotations.Test;

//6. Afisam in consola doar numerele pare pana la 10 (utilizam "for");

public class Tema2Part6 {

    @Test
    public void afisamRezultat (){

        //numerePare(10);
        numerePareV2(10);
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
}
