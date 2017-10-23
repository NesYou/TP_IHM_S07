package actions;

import com.opensymphony.xwork2.ActionSupport;
import modele.GestionDemineur;
import modele.GestionDemineurInterface;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class Environnement extends ActionSupport implements ApplicationAware, SessionAware {

    private GestionDemineurInterface facade;

    private Map<String,Object> session;

    public Map<String, Object> getSession() {
        return session;
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        this.setFacade((GestionDemineurInterface) application.get("facade"));
        if(facade == null) {
            facade = new GestionDemineur();
            application.put("facade",facade);
        }
    }

    public void setFacade(GestionDemineurInterface facade) {
        this.facade = facade;
    }

    public String getPseudo() {
        return (String) this.getSession().get("pseudo");
    }

    public void setPseudo(String pseudo) {
        this.getSession().put("pseudo",pseudo);
    }

    protected GestionDemineurInterface getFacade() {
        return facade;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
