package action.professeur;

import com.opensymphony.xwork2.ActionSupport;
import modele.FonctionnalitesStaticVersion;
import modele.IFonctionnalites;
import modele.Prof;
import org.apache.struts2.interceptor.ApplicationAware;

import java.util.Date;
import java.util.Map;

public class ModifierProfesseur extends ActionSupport implements ApplicationAware {

    private int idProfesseurAModifier;
    private String nouveauNomProfesseur;
    private String nouveauPrenomProfesseur;
    private Date nouvelleDateDeNaissanceProfesseur;
    private Prof leProf;

    private IFonctionnalites facade;

    public int getIdProfesseurAModifier() {
        return idProfesseurAModifier;
    }

    public void setIdProfesseurAModifier(int idProfesseurAModifier) {
        this.idProfesseurAModifier = idProfesseurAModifier;
    }

    public String getNouveauNomProfesseur() {
        return nouveauNomProfesseur;
    }

    public void setNouveauNomProfesseur(String nouveauNomProfesseur) {
        this.nouveauNomProfesseur = nouveauNomProfesseur;
    }

    public String getNouveauPrenomProfesseur() {
        return nouveauPrenomProfesseur;
    }

    public void setNouveauPrenomProfesseur(String nouveauPrenomProfesseur) {
        this.nouveauPrenomProfesseur = nouveauPrenomProfesseur;
    }

    public Date getNouvelleDateDeNaissanceProfesseur() {
        return nouvelleDateDeNaissanceProfesseur;
    }

    public void setNouvelleDateDeNaissanceProfesseur(Date nouvelleDateDeNaissanceProfesseur) {
        this.nouvelleDateDeNaissanceProfesseur = nouvelleDateDeNaissanceProfesseur;
    }

    public void setLeProf(Prof leProf) {
        this.leProf = leProf;
    }

    public Prof getLeProf() {
        return leProf;
    }

    public String execute() throws Exception {
        facade.getProfBase(idProfesseurAModifier).setPrenom(this.getNouveauPrenomProfesseur());
        facade.getProfBase(idProfesseurAModifier).setNom(this.getNouveauNomProfesseur());
        facade.getProfBase(idProfesseurAModifier).setDateDeNaissance(this.getNouvelleDateDeNaissanceProfesseur());
        this.setLeProf(facade.getProfBase(idProfesseurAModifier));
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
