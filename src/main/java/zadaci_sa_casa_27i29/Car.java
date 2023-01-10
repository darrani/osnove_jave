package zadaci_sa_casa_27i29;

public class Car {
    //ime i prezime vozaca
//marku automobila
//broj vrata
//potrosnju na 100km (npr: 10)
//trenutnu brzinu kojom se auto krece
    public String vlasnik;
    public String marka;
    public int brojVrata;
    public double fabrickaPotrosnja;
    public double trenutnaBrzina;
    public int trenutnaPotrosnja;

    public void stampaj(){
        System.out.println(this.vlasnik);
        System.out.println(this.marka+" - "+ this.brojVrata+"-ro vrata");
        System.out.println("Sa potrosnjom od "+ this.fabrickaPotrosnja
                +" l na 100km");
        System.out.println(this.trenutnaBrzina + " km/h je trenutna brzina.");
    }

//metodu za stampu koja stampa podatke u formatu:
//[Vozac]
//	[Marka] - [br vrata]-ro vrata
//	Sa potrosnjom od [potrosnja] l na 100km
//	[Trenutna brzina auta] km/h je trenutna brzina.
//
//    (Dopuna)
//U okviru klase Auto, implementirati jos 2 metode:
//metoda koja vraca informaciju da li je vozac prekoracio brzinu.
// Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true
// ili false ako je trenutna brzina veca od ogranicenja.
//metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu
// prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine

    public boolean prekoracenje(int ogranicenje){
        if(this.trenutnaBrzina>ogranicenje){
            return true;
        }return false;
    }
    public double kazna(int ogranicenje){
        double prekoracenje = this.trenutnaBrzina-ogranicenje;
        if(prekoracenje>0){
            return prekoracenje*1000;
        }
        return 0;
    }

//    Dopuniti klasu Auto tako da ima:
//atribut godinu proizvodnje
//atribut mesec do kad je registrovan auto (int)
//atribut kubikaza auta (npr: 1600 - 5000)
//metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je
// oldtimer.
//metodu koja vraca da li je istekla registracije. Metoda kao parametar prima
// trenutni mesec i na osnovu toga vraca true ili false.
//metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000
// kubika cena registracije kubikaza * 100din,


    public int godinaProizvodnje;
    public int registrovanDo;
    public int kubikaza;
    public boolean jeOldTimer(){
        if(this.godinaProizvodnje < 1950){
            return true;
        }else{
            return false;
        }
    }
    public boolean isteklaRegistracija(int currentMonth){
        if(this.registrovanDo>currentMonth){
            return true;
        }else{
            return false;
        }
    }
    public int cenaRegistracije(){
        int cena = kubikaza * 100;
        if(kubikaza>2000){ // za automobile preko 2000 kubika dodatno
                           // se uracunava 30% na cenu.
            cena = cena * 130 /100;
        }
        return cena;
    }
    public String regBroj;
    public boolean ukljucenjKlima;
    public void dodajGas() {
        this.trenutnaBrzina = this.trenutnaBrzina + 10;
        //Promenite metodu dodajGas tako da povecanje brzine ne bude preko
        // maksimalne brzine auta
        if (this.trenutnaBrzina > this.maxBrzina) {
            this.trenutnaBrzina = this.maxBrzina;
        }
    }
    public void stampajTablu(){
        double brzinaUProcentina = (this.trenutnaBrzina*100)/this.maxBrzina;
        for (int i = 0; i <100 ; i++) {
            if(i<brzinaUProcentina){
                System.out.print("|");
            }else{
                System.out.print(".");
            }
        }
        System.out.println(this.trenutnaBrzina + "/"+ this.maxBrzina+ "km/h.");
    }

        //metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima
        // 100 jedinica za
// prikaz brzine.
//Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa
//               |||||||||||||||||||||||||||||||||||||||||..................................................................... 100/240km/h

    public void koci(){
        this.trenutnaBrzina = this.trenutnaBrzina-10;
        if(this.trenutnaBrzina<0){
            this.trenutnaBrzina = 0;
        }
    }
//    public double faktorKlime(){
//        double faktor = 1.0;
//        if(this.ukljucenjKlima){
//            faktor = 1.2;
//        } return faktor;
//    }
//    public double trenutnaPotrosnja(){
//        return this.trenutnaBrzina / 100 * this.fabrickaPotrosnja+ faktorKlime();
//    }
    public double trenutnaPotrosnja(){
        double faktor = 1.0;
        if(this.ukljucenjKlima){
            faktor= 1.2;
        }
        return this.trenutnaBrzina/100*this.fabrickaPotrosnja*faktor;
    }
    //Dopuniti klasu Auto tako da ima:
    //atribut broj registracije
    //da li je ukljucena klima u autu
    //metodu dodajGas, koja povecava trenutnu brzinu za 10.
    //metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
    //metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
    //faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
    //(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime


    public int maxBrzina;
//    Dopuna 4)
//	Dopuniti klasu Auto tako da ima:
//atribut za maksimalnu brzinu na auto (npr: 240)
//Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
//metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za
// prikaz brzine.
//Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa
//               |||||||||||||||||||||||||||||||||||||||||................................
//               ..................................... 100/240km/h
//(objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje
// oznacavaju ostatak do maksimalne brzine)
//Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.


    public int kapacitetRezervoara;
    public int trenitnoURezervoaru;
//    Dopuniti klasu Auto tako da ima:
//kapacitet rezervoara
//trenutnu kolicinu goriva u rezervoaru (u litrima)
//metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci a vraca
// novcanu vrednost goriva. Litar goriva je 210din.. Vodite racuna da trenutna kolicina
// goriva ne predje kapacitet rezervoara, takodje ukoliko
// se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.
    public int natoci(int litraza){
        int cena = 0;
        int razlika = this.kapacitetRezervoara-this.trenitnoURezervoaru;
        if(razlika>=litraza){
            this.trenitnoURezervoaru = litraza;
            cena = litraza * 210;
        }else{
            this.trenitnoURezervoaru = this.kapacitetRezervoara;
            cena = razlika *210;
        }
        return cena;
    }
}
