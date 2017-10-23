package actions;

import modele.Plateau;
import modele.exceptions.ExceptionLoginDejaPris;

public class Connexion extends Environnement {

    private Plateau lePlateau;

    @Override
    public String execute() throws Exception {
        try {
            this.getFacade().connexion(this.getPseudo());
            lePlateau = this.getFacade().getPlateau(this.getPseudo());
        } catch (ExceptionLoginDejaPris e) {
            this.addActionError("Le pseudo "+this.getPseudo()+" est déjà utilisé.");
            return ERROR;
        }
            return SUCCESS;
    }

    public Plateau getLePlateau() {
        return lePlateau;
    }
}