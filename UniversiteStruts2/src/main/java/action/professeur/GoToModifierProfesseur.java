package action.professeur;

import com.opensymphony.xwork2.ActionSupport;
import modele.FonctionnalitesStaticVersion;
import modele.IFonctionnalites;
import modele.Prof;
import org.apache.struts2.interceptor.ApplicationAware;

import java.util.Map;

public class GoToModifierProfesseur extends ActionSupport implements ApplicationAware{

    private int idProfesseurAModifier;

    private IFonctionnalites facade;

    public int getIdProfesseurAModifier() {
        return idProfesseurAModifier;
    }

    public void setIdProfesseurAModifier(Prof idprofesseurAModifier) {
        this.idProfesseurAModifier = idProfesseurAModifier;
    }

    public String execute() throws Exception {
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
