package zadaci_sa_casa_27i29;

import java.util.Scanner;

public class ZadatakRacun {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Account firstAccount = new Account();
        firstAccount.numberOfAccount = "840-2323412-22";
        firstAccount.owner = "Dragana Nikolic";
        firstAccount.balance = 510250;
        System.out.println(firstAccount.numberOfAccount + " " + firstAccount.owner + " "+ firstAccount.balance);

        Account secondAccount = new Account();
        secondAccount.numberOfAccount = "840-8787609-00";
        secondAccount.owner = "Petar Nikolic";
        secondAccount.balance = 100500;
        System.out.println(secondAccount.numberOfAccount + " " + secondAccount.owner + " "+ secondAccount.balance);

        System.out.println("Unesite iznost za transakciju:");
        int iznos = s.nextInt();

        firstAccount.balance=firstAccount.balance - iznos;
        secondAccount.balance = secondAccount.balance + iznos;

        System.out.println("Novo stanje racuna je: "+ firstAccount.balance);
        System.out.println("Novo stanje racuna je : " + secondAccount.balance);

    }
}
