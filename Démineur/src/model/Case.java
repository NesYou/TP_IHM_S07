package model;

public class Case {

    private boolean revelated;
    private boolean bombe;
    private int valeur;

    public boolean isRevelated() {
        return this.revelated;
    }

    public void setRevelated(boolean revelated) {
        this.revelated = revelated;
    }

    public boolean isBombe() {
        return this.bombe;
    }

    public void setBombe(boolean bombe) {
        this.bombe = bombe;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}
