package Entitet;

public class Låner {
    private int idLåner, postnr;
    private String navn, adresse;


    public Låner(int idLåner, String navn, String adresse , int postnr) {
        this.idLåner = idLåner;
        this.postnr = postnr;
        this.navn = navn;
        this.adresse = adresse;
    }
    public Låner(String navn, String adresse, int postnr)
    {
        this.navn = navn;
        this.adresse = adresse;
        this.postnr = postnr;
    }

    public int getIdLåner() {
        return idLåner;
    }

    public int getPostnr() {
        return postnr;
    }

    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setIdLåner(int idLåner) {
        this.idLåner = idLåner;
    }

    public void setPostnr(int postnr) {
        this.postnr = postnr;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Låner{" +
                "idLåner=" + idLåner +
                ", postnr=" + postnr +
                ", navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
