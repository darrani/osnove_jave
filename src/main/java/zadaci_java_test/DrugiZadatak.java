package zadaci_java_test;

import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {
//Zadatak (Petlje)
//Napisati program koji petljom iscrtava toplomer. Korisnik sa tastature unosi granice toplomera i iscrtava se slika kao u primeru
//Primer izvrsenja 1:
//Unesite donju granicu toplomera: 35
//Unesite gornju granicu toplomera: 42

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite donju granicu toplomera: ");
        int donjaGranica = s.nextInt();
        System.out.println("Unesite gornju granicu toplomera: ");
        int gornjaGranica = s.nextInt();
        for (int i = donjaGranica; i >= gornjaGranica; i--) {
            System.out.println("|-"+ i + "  |");

        }
        System.out.println("|    |");
        System.out.println("|    |");
//|-42  |
//|-41  |
//|-40  |
//|-39  |
//|-38  |
//|-37  |
//|-36  |
//|-35  |
// |    |
// |    |
//
//Primer izvrsenja 2:
//Unesite donju granicu toplomera: 34
//Unesite gornju granicu toplomera: 40
//|-40  |
//|-39  |
//|-38  |
//|-37  |
//|-36  |
//|-35  |
//|-34  |
// |    |
// |    |
    }
}
