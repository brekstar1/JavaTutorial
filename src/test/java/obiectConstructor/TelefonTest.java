package obiectConstructor;

import org.testng.annotations.Test;

public class TelefonTest {

    @Test
    public void metodaTest(){

        Telefon SamsungS25 = new Telefon("Samsung","Galaxy S25",2025,"Android 15 with One UI 7","4000mAh",4000);
        SamsungS25.prezentareTelefon();
        System.out.println();

        Telefon Iphone15 = new Telefon("Apple","Iphone 15",2024,"IOS 17","3349mAh",4200);
        Iphone15.prezentareTelefon();
        System.out.println();

        SamsungS25.operatingSystem = "Android 16 with One UI 7";
        SamsungS25.prezentareTelefon();
    }
}
