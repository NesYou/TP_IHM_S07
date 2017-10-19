package action.professeur;

import com.opensymphony.xwork2.ActionSupport;
import modele.FonctionnalitesStaticVersion;
import modele.IFonctionnalites;
import modele.Prof;
import org.apache.struts2.interceptor.ApplicationAware;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class GoToGoToModifierProfesseur extends ActionSupport implements ApplicationAware{

    private Collection<Prof> lesProfs;
    private IFonctionnalites facade;

    public Collection<Prof> getLesProfs() {
        return lesProfs;
    }

    public void setLesProfs(Collection<Prof> lesProfs) {
        this.lesProfs = lesProfs;
    }

    public IFonctionnalites getFacade() {
        return facade;
    }

    public void setFacade(IFonctionnalites facade) {
        this.facade = facade;
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
        } else {
            this.lesProfs = new ArrayList<>(facade.getProfsBase());
        }
    }
}
