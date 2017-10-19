package action;

import com.opensymphony.xwork2.ActionSupport;
import modele.FonctionnalitesStaticVersion;
import modele.IFonctionnalites;
import modele.Prof;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Collection;
import java.util.Map;

public class Environement extends ActionSupport implements ApplicationAware,SessionAware {

    private IFonctionnalites facade;

    public IFonctionnalites getFacade() {
        return facade;
    }

    public void setFacade(IFonctionnalites facade) {
        this.facade = facade;
    }

    public Map<String, Object> getVariablesSessions() {
        return variablesSessions;
    }

    public void setVariablesSessions(Map<String, Object> variablesSessions) {
        this.variablesSessions = variablesSessions;
    }

    private Map<String,Object> variablesSessions;

    public Collection<Prof> getLesProfs() {
        return this.facade.getProfsBase();
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        facade = (IFonctionnalites) application.get("facade");
        if(facade == null) {
            facade = new FonctionnalitesStaticVersion();
            application.put("facade",facade);
        }
    }

    @Override
    public void setSession(Map<String, Object> session) {
        variablesSessions = session;
    }
}
