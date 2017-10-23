package actions;


public class Deconnexion extends Environnement {

    @Override
    public String execute() throws Exception {
        this.getFacade().deconnexion(this.getPseudo());
        return SUCCESS;
    }

}