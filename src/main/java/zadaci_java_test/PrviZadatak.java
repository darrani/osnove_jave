package zadaci_java_test;

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
//       1. Zadatak (Grananja)
//      Napisati program koji za dve unete osobe ispisuje koja je starija.
//        Za svaku osobu se od  podataka unosi ime, godina, mesec i dan rodjenja.
//        Na kraju programa ispisati koja je osoba starija.
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime prve osobe: ");
        String ime1 = s.next();
        System.out.println("Unesite godinu rodjenja prve osobe:");
        int godRodjenja1 = s.nextInt();
        System.out.println("Unesite mesec rodjenja prve osobe: ");
        int mesecRodjenja1 = s.nextInt();
        System.out.println("Unesite dan rodjenja prve osobe:");
        int danRodjenja1 = s.nextInt();

        System.out.println("Unesite ime druge osobe: ");
        String ime2 = s.next();
        System.out.println("Unesite godinu rodjenja druge osobe:");
        int godRodjenja2 = s.nextInt();
        System.out.println("Unesite mesec rodjenja druge osobe: ");
        int mesecRodjenja2 = s.nextInt();
        System.out.println("Unesite dan rodjenja druge osobe:");
        int danRodjenja2 = s.nextInt();

        if(godRodjenja1>godRodjenja2 && mesecRodjenja1<mesecRodjenja2&&danRodjenja1>danRodjenja2){
            System.out.println(ime1 + " je stariji.");
        }else if(godRodjenja1 == godRodjenja2 && mesecRodjenja1<mesecRodjenja2&&danRodjenja1>danRodjenja2) {
            System.out.println(ime1 + " je stariji!");
        } else if (godRodjenja1== godRodjenja2 && mesecRodjenja1==mesecRodjenja2&&danRodjenja1>danRodjenja2) {
            System.out.println(ime2 + " je stariji.");
        } else if (godRodjenja1== godRodjenja2 && mesecRodjenja1==mesecRodjenja2&&danRodjenja1 == danRodjenja2) {
            System.out.println("Iste su starosti!");
        }

//
//        Primer izvrsenja 1:
//        Unesite ime prve osobe: Pera
//        Unesite godinu rodjenja prve osobe: 1998
//        Unesite mesec rodjenja prve osobe: 10
//        Unesite dan rodjenja prve osobe: 21
//        Unesite ime druge osobe: Mika
//        Unesite godinu rodjenja druge osobe: 1999
//        Unesite mesec rodjenja druge osobe: 12
//        Unesite dan rodjenja druge osobe: 15
//        Pera je stariji.
//
//                Primer izvrsenja 2:
//        Unesite ime prve osobe: Pera
//        Unesite godinu rodjenja prve osobe: 1998
//        Unesite mesec rodjenja prve osobe: 10
//        Unesite dan rodjenja prve osobe: 21
//        Unesite ime druge osobe: Mika
//        Unesite godinu rodjenja druge osobe: 1998
//        Unesite mesec rodjenja druge osobe: 12
//        Unesite dan rodjenja druge osobe: 15
//        Pera je stariji.
//
//                Primer izvrsenja 3:
//        Unesite ime prve osobe: Pera
//        Unesite godinu rodjenja prve osobe: 1998
//        Unesite mesec rodjenja prve osobe: 10
//        Unesite dan rodjenja prve osobe: 21
//        Unesite ime druge osobe: Mika
//        Unesite godinu rodjenja druge osobe: 1998
//        Unesite mesec rodjenja druge osobe: 10
//        Unesite dan rodjenja druge osobe: 15
//        Mika je stariji.
//
//                Primer izvrsenja 4:
//        Unesite ime prve osobe: Pera
//        Unesite godinu rodjenja prve osobe: 1998
//        Unesite mesec rodjenja prve osobe: 10
//        Unesite dan rodjenja prve osobe: 21
//        Unesite ime druge osobe: Mika
//        Unesite godinu rodjenja druge osobe: 1998
//        Unesite mesec rodjenja druge osobe: 10
//        Unesite dan rodjenja druge osobe: 21
//        Iste su starosti.
//

    }
}
