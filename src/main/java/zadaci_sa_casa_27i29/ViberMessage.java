package zadaci_sa_casa_27i29;

public class ViberMessage {
//    Krairti klasu SlackMessage koja ima:
//tekst poruke
//ime i prezime osobe koja je stavila poruku
//datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)


    public String text;
    public String firstName;
    public String lastName;
    public String sendAt;
  public void stampaj(){
      System.out.println(this.text );
      System.out.println(this.firstName + " " + this.lastName + " vreme slanje: " + this.sendAt);
  }

//Dopuna:
//Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u formatu
// koji je naveden iznad i
// u mainu pozovite metode nad objektima koje ste kreirali.
}

