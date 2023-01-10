package zadaci_sa_casa_27i29;

public class ZadatakCar {
    public static void main(String[] args) {

//    Kreirati klasu Auto koja ima:
//ime i prezime vozaca
//marku automobila
//broj vrata
//potrosnju na 100km (npr: 10)
//trenutnu brzinu kojom se auto krece
        Car car = new Car();
        car.vlasnik = "Dragana Nikolic";
        car.marka = "mercedes";
        car.brojVrata = 5;
        car.fabrickaPotrosnja = 10;
        car.trenutnaBrzina = 100;
        car.stampaj();

//metodu za stampu koja stampa podatke u formatu:
//[Vozac]
//	[Marka] - [br vrata]-ro vrata
//	Sa potrosnjom od [potrosnja] l na 100km
//	[Trenutna brzina auta] km/h je trenutna brzina.
//
//U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu
// informacija koje dobijete od njih.

        if(car.prekoracenje(50)){
            System.out.println("Desilo se prekoracenje!");
            System.out.println("Kazna je " + car.kazna(50));
        }else {
            System.out.println("Nema prekoracenja!");
        }
// metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu
// prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine

        car.godinaProizvodnje = 1988;
        car.registrovanDo = 3;
        car.kubikaza = 1400;
        if (car.jeOldTimer()){
            System.out.println("Jeste oldtimer");
        }else{
            System.out.println("Nije oldtimer");
        }

//metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je
// oldtimer.

        if(car.isteklaRegistracija(5)) {
            System.out.println("Registracija je istekla!");
        }else{
            System.out.println("Jos uvek je registrovan!");
        }
// metodu koja vraca da li je istekla registracije. Metoda kao parametar prima
// trenutni mesec i na osnovu toga vraca true ili false.

        System.out.println("Cena registracije je: " + car.cenaRegistracije());
// metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000
// kubika cena registracije kubikaza * 100din,

        car.regBroj = "Ni-232-KL";
        car.ukljucenjKlima = false;
// atribut broj registracije
//    //da li je ukljucena klima u autu


        System.out.println(car.trenutnaBrzina);

        //atribut za maksimalnu brzinu na auto (npr: 240)
        car.maxBrzina = 240;
        System.out.println(car.trenutnaPotrosnja);
        car.stampajTablu();
        car.dodajGas();
        car.dodajGas();
        car.dodajGas();
        car.dodajGas();
        car.koci();

        car.kapacitetRezervoara = 50;
        car.trenitnoURezervoaru = 20;
    }


}
