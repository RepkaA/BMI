package metodus_gyak;

import java.util.Locale;
import java.util.Scanner;

public class Metodus_gyak {

   
    public static void main(String[] args) {
       cim("BMI index kiszámítása");
        int tomeg = beker("Testtömeg ( kg ) [40 - 150]:",40, 150 );
        int magassag = beker("Testmagasság ( cm) [100 - 200 ], ",40, 150);
        double bmiIndex =bmi(tomeg,magassag);
        ertekeles(tomeg,magassag,bmiIndex);
    }

    private static void cim(String szoveg) {
        System.out.println(szoveg);
    }

    private static int beker(String kerdes, int also, int felso) {
        System.out.println(kerdes);
        
        Scanner sc= new Scanner(System.in);
        int szam = -1;
        boolean jo = false;
        while (!jo) {
            szam = sc.nextInt();
            jo = szam >=100 && szam <= 200;
            if (!jo) {
                System.out.println("Nem jó,újra");
                System.out.print(kerdes);
            }
        }
        return szam;
    }

    private static double bmi(int tomeg, int magassag) {
     return tomeg / Math.pow(magassag, 100);
    }

    private static void ertekeles(int tomeg, int magassag, double bmiindex) {
        System.out.printf("Ön %d  cm magas és %d   kg tömeg. Ön túlsúlyos");
        System.out.printf(Locale.ENGLISH,"Így BMI indexe 27.5,\n",bmiindex);
        String testalkat = "túlsúlyos";
        System.out.printf("Tehát ön %s testalkatú\n",testalkat);
    }
    
}
