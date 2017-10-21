import com.opensymphony.xwork2.ActionSupport;
import modele.GestionDemineur;
import modele.GestionDemineurInterface;
import org.apache.struts2.interceptor.ApplicationAware;

import java.util.Map;

public class Environement extends ActionSupport implements ApplicationAware {

    private GestionDemineurInterface facade;

    public GestionDemineurInterface getFacade() {
        return facade;
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        facade = (GestionDemineurInterface) application.get("facade");
        if(facade == null) {
            facade = new GestionDemineur();
            application.put("facade",facade);
        }
    }
}
