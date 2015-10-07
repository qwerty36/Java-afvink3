/**
 * Created by richard on 10/7/15.
 */
public class afvink3 {
    private String naam;
    private int nummer;

    public afvink3(String naam, int nummer) {
        this.naam = naam;
        this.nummer = nummer;
    }

    public afvink3(String studnaam) {
        naam = studnaam;
    }

    public afvink3(int studnummer) {
        nummer = studnummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void printInfo() {
        System.out.println("Helleuw " + getNaam() + " Je nummer is " + getNummer());
    }
}
