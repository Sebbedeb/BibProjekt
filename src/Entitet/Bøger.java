package Entitet;

public class Bøger {
    private int idbøger;
    private String titel, forfatter;

    public Bøger(int idbøger, String titel, String forfatter) {
        this.idbøger = idbøger;
        this.titel = titel;
        this.forfatter = forfatter;
    }

    public int getIdbøger() {
        return idbøger;
    }

    public void setIdbøger(int idbøger) {
        this.idbøger = idbøger;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    @Override
    public String toString() {
        return "Bøger{" +
                "idbøger=" + idbøger +
                ", titel='" + titel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                '}';
    }
}
