package model;

public interface InterfacePlateau {
    void initialiserPlateau();

    void armerPlateau();

    boolean jouerPartie(int x, int y);

    int getTaille();

    void setTaille(int taille);

    Case[][] getPlateau();

    void setPlateau(Case[][] plateau);
}
