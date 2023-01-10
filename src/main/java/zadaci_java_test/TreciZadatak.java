package zadaci_java_test;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class TreciZadatak {
    public static void main(String[] args) {
//Zadatak (Nizovi)
//Napisati program koji cuva dva niza celih brojeva, jedan za parne brojeve a drugi za
// neparne brojeve. Program sa tastature ucitava N brojeva koje unosi korisnik i parne brojeve
// dodaje u niz parnih brojeva a neparne brojeve u niz neparnih. Na kraju programa odstampati
// brojeve oba niza kao i sumu svakog niza.
//Napomena: Nizovi se stampaju koristeci petlje.
//
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizParni= new ArrayList<>();
        ArrayList<Integer> nizNeparni = new ArrayList<>();

        System.out.println("Unesite N brojeva");
        int n = s.nextInt();
        int a = 0;
        int sumParni = 0;
        int sumNeparni = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            a = s.nextInt();
            if( a%2 == 0){
                nizParni.add(a);
                sumParni = sumParni + a;
            }else {
                nizNeparni.add(a);
                sumNeparni = sumNeparni + a;
            }

        }
        System.out.println("Niz parnih: " + nizParni);
        System.out.println(" Suma parnih: " + sumParni);
        System.out.println("Niz neparnih: " + nizNeparni);
        System.out.println(" Suma neparnih: " + sumNeparni);

    }
}

//Primer izvrsenja:
//Unesite N: 9
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 4
//Unesite broj: 8
//Unesite broj: 3
//Unesite broj: 9
//Unesite broj: 13
//Unesite broj: 10
//Unesite broj: 4
//
//Niz parnih: 2, 4, 8, 10, 4
//Suma parnih: 28
//Niz neparnih: 1, 3, 9, 13
//Suma neparnih: 26
//


