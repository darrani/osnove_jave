package zadaci_sa_casa_27i29;

public class ZadatakViber {
    public static void main(String[] args) {
        //U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima
// i ostampati obe poruke u formatu:
//[ime i prezime osobe] - [kad je poslata]
//[Tekst poruke]

        ViberMessage poruka1 = new ViberMessage();
        poruka1.firstName = "Dragana";
        poruka1.lastName = "Nikolic";
        poruka1.sendAt="01.01. 01:05";
        poruka1.text = "Srecna Nova Godina!";

        ViberMessage poruka2 = new ViberMessage();
        poruka2.firstName = "Uros";
        poruka2.lastName = "Nikolic";
        poruka2.sendAt = "01.01. 01.06";
        poruka2.text = "Hvala, takodje, sve najlepse!";

        poruka1.stampaj();
        poruka2.stampaj();

    }
}
