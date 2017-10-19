package action.filiere;

import com.opensymphony.xwork2.ActionSupport;
import modele.FonctionnalitesStaticVersion;
import modele.IFonctionnalites;
import modele.Prof;
import org.apache.struts2.interceptor.ApplicationAware;

import java.util.ArrayList;
import java.util.Map;

public class GoToCreerFiliere extends ActionSupport implements ApplicationAware {

    private ArrayList<Prof> lesProfs;
    private IFonctionnalites facade;

    public String execute() throws Exception {
        return super.execute();
    }

    public ArrayList<Prof> getLesProfs() {
        return lesProfs;
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
