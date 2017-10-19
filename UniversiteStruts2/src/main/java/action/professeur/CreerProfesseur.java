package action.professeur;

import com.opensymphony.xwork2.ActionSupport;
import modele.FonctionnalitesStaticVersion;
import modele.IFonctionnalites;
import modele.Prof;
import org.apache.struts2.interceptor.ApplicationAware;

import java.util.Date;
import java.util.Map;

public class CreerProfesseur extends ActionSupport implements ApplicationAware{

    private String nomProfesseur;
    private String prenomProfesseur;
    private Date dateNaissanceProfesseur;

    private Prof leProf;

    private IFonctionnalites facade;


    private String getNomProfesseur() {
        return nomProfesseur;
    }

    public void setNomProfesseur(String nomProfesseur) {
        this.nomProfesseur = nomProfesseur;
    }

    private String getPrenomProfesseur() {
        return prenomProfesseur;
    }

    public void setPrenomProfesseur(String prenomProfesseur) {
        this.prenomProfesseur = prenomProfesseur;
    }

    private Date getDateNaissanceProfesseur() {
        return dateNaissanceProfesseur;
    }

    public void setDateNaissanceProfesseur(Date dateNaissanceProfesseur) {
        this.dateNaissanceProfesseur = dateNaissanceProfesseur;
    }

    public Prof getLeProf() {
        return leProf;
    }

    public void setLeProf(Prof leProf) {
        this.leProf = leProf;
    }

    @Override
    public String execute() throws Exception {
        leProf = facade.ajouterProfesseurBase(this.getPrenomProfesseur(),this.getNomProfesseur(),this.getDateNaissanceProfesseur());
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
