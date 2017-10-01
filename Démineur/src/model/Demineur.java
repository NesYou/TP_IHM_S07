package model;

public class Demineur {

    public static void main(String[] args) {
        /* Initialisation du plateau et de la partie */
        InterfacePlateau interfacePlateau = new Plateau(10);
        System.out.println(interfacePlateau.toString());
    }

}
