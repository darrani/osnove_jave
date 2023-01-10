package zadaci_java_test;

import java.util.Scanner;

public class PetiZadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//Zadatak (Metode)
//Napisati metodu koja radi pakovanje nekog teksta u HTML elemente. Metoda kao parametar
// prima tekst i tip, a vraca HTML element (String) sa proslednjenim tekstom.
//Metoda podrzava sledece tipove:
//bold, metoda pakuje tekst u <b>prosledjen tekst</b>
//italic, metoda pakuje tekst u <em>proslednjen tekst</em>
//paragraph, metoda pakuje tekst u <p>prosledjen tekst</p>
//Ukoliko se prosledi tip koji nije podrzan, vraca se neupakovan tekst tj. vraca se nakav
// kakav je dosao umetodu
//
//U glavnom programu koristeci kreiranu metodu napisati porogram koji prikazuje sledeci tekst.
//<b>Ovaj deo je bold</b>, a <em>ovo je italic</em>
//<p>Naravno samo je falio paragraf</p>

        String  text = htmlElement("Ovaj deo je bold", "bold");
        String text1 = htmlElement("ovo je italic", "italic");
        String text2 =  htmlElement("Naravno samo je falio paragraf", "paragraph");

        System.out.println(htmlElement("Ovaj deo je bold", "bold")
        + ", a" + htmlElement("ovo je italic", "italic")
        + "\n" + htmlElement("Naravno samo je falio paragraf", "paragraf"));

    }
    public static String htmlElement(String text, String tip) {
        if (tip.equals("bold")) {
           String a  = "<b>" + text + "</b>";
            return a;
        } else if (tip.equals("italic")) {
            String b = "<em>" + text + "<em>";
            return b;
        }else if(tip.equals("paragraf")){
            String c = "<p>" + text + "<em/>";
            return c;
        }else{
            return text;
        }
    }
}



