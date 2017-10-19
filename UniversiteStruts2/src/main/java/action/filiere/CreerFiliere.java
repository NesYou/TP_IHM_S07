package action.filiere;

import com.opensymphony.xwork2.ActionSupport;
import modele.Annee;
import modele.FonctionnalitesStaticVersion;
import modele.IFonctionnalites;
import modele.Prof;
import org.apache.struts2.interceptor.ApplicationAware;

import java.util.Map;

public class CreerFiliere extends ActionSupport implements ApplicationAware {

    private String libelle;
    private int responsable;

    private Annee anneeCreee;

    private IFonctionnalites facade;

    public Annee getAnneeCreee() {
        return anneeCreee;
    }

    public void setAnneeCreee(Annee anneeCreee) {
        this.anneeCreee = anneeCreee;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    public String execute() throws Exception {
        anneeCreee = facade.creerFiliere(libelle, responsable);
        return super.execute();
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        facade = (IFonctionnalites) application.get("facade");
        if(facade == null) {
            facade = new FonctionnalitesStaticVersion();
            application.put("facade",facade);
        }
    }
}
