package model;

import java.util.Random;

public class Plateau {

    private Case[][] plateau;
    private int taille;

    public Plateau(int taille) {
        this.taille = taille;
        this.plateau = new Case[taille][taille];

        /*Initialisation du plateau*/
        System.out.println("Initialisation du plateau...");
        this.initialiserPlateau();
    }


    public void initialiserPlateau() {
        for(int i = 0; i < taille; i++) {
            for(int j = 0; j < taille; j++) {
                this.plateau[i][j] = new Case();
            }
        }
        /*Placement des mines sur le plateau*/
        System.out.println("Placement des mines sur le plateau...");
        this.armerPlateau();

        /*Attribution des valeurs*/
        System.out.println("Attribution des valeurs aux cases adjacentes aux bombes...");
        int valeurDeLaCase = 0;
        for(int i = 0; i < taille; i++) {
            for(int j = 0; j < taille; j++) {
                if(!this.getPlateau()[i][j].isBombe()) {
                    //NORD
                    try {
                        if (this.getPlateau()[i - 1][j].isBombe()) {
                            valeurDeLaCase++;
                        }
                    } catch (IndexOutOfBoundsException ignored) {

                    }
                    //NORD-OUEST
                    try {
                        if(this.getPlateau()[i-1][j-1].isBombe()) {
                            valeurDeLaCase++;
                        }
                    } catch (IndexOutOfBoundsException ignored) {

                    }
                    //OUEST
                    try {
                        if (this.getPlateau()[i][j - 1].isBombe()) {
                            valeurDeLaCase++;
                        }
                    } catch (IndexOutOfBoundsException ignored) {

                    }
                    //SUD-OUEST
                    try {
                        if (this.getPlateau()[i + 1][j - 1].isBombe()) {
                            valeurDeLaCase++;
                        }
                    } catch (IndexOutOfBoundsException ignored) {

                    }
                    //SUD
                    try {
                        if (this.getPlateau()[i + 1][j].isBombe()) {
                            valeurDeLaCase++;
                        }
                    } catch (IndexOutOfBoundsException ignored) {

                    }
                    //SUD-EST
                    try {
                        if (this.getPlateau()[i + 1][j + 1].isBombe()) {
                            valeurDeLaCase++;
                        }
                    } catch (IndexOutOfBoundsException ignored) {

                    }
                    //EST
                    try {
                        if (this.getPlateau()[i][j + 1].isBombe()) {
                            valeurDeLaCase++;
                        }
                    } catch (IndexOutOfBoundsException ignored) {

                    }
                    //NORD-EST
                    try {
                        if (this.getPlateau()[i - 1][j + 1].isBombe()) {
                            valeurDeLaCase++;
                        }
                    } catch (IndexOutOfBoundsException ignored) {

                    }
                    this.getPlateau()[i][j].setValeur(valeurDeLaCase);
                    valeurDeLaCase = 0;
                }
            }
        }
    }


    public void armerPlateau() {
        Random random = new Random();
        int minesPlacees = 0;
        int nbMines = (int)((this.getTaille() * this.getTaille()) * (10.0f/100.0f));
        while(minesPlacees < nbMines) {
            int x = random.nextInt(this.getTaille());
            int y = random.nextInt(this.getTaille());
            if(!this.getPlateau()[x][y].isBombe()) {
                this.getPlateau()[x][y].setBombe(true);
                minesPlacees++;
            }
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < this.getTaille(); i++) {
            for(int j = 0; j < this.getTaille(); j++) {
                if(this.getPlateau()[i][j].isRevelated()) {
                    if (this.getPlateau()[i][j].isBombe()) {
                        str.append("B|");
                    } else if (this.getPlateau()[i][j].getValeur() > 0) {
                        str.append(this.getPlateau()[i][j].getValeur()).append("|");
                    } else {
                        str.append(" |");
                    }
                } else {
                    str.append("X|");
                }
            }
            str.append("\n");
        }
        return str.toString();
    }

    public boolean jouerPartie(int x, int y) {
        return false;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public Case[][] getPlateau() {
        return plateau;
    }

    public void setPlateau(Case[][] plateau) {
        this.plateau = plateau;
    }
}
