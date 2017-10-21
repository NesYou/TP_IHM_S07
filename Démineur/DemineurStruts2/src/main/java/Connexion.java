import modele.Plateau;
import modele.exceptions.ExceptionLoginDejaPris;

public class Connexion extends Environement {

    private String pseudo;
    private Plateau lePlateau;

    @Override
    public String execute() throws Exception {
        try {
            this.getFacade().connexion(pseudo);
            lePlateau = this.getFacade().getPlateau(pseudo);
        } catch (ExceptionLoginDejaPris e) {
            this.addActionError("Le pseudo "+this.getPseudo()+" est déjà utilisé.");
            return ERROR;
        }
            return SUCCESS;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Plateau getLePlateau() {
        return lePlateau;
    }
}
