package controleur;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Fred on 15/09/2016.
 */
public class Controleur extends HttpServlet {

    /* REDIRECTION KEYS */
    private final static String HOME = "home";
    // AJOUTS
    private final static String AJOUTER_PROF = "ajouterProf";
    private final static String AJOUTER_ETUDIANT = "ajouterEtudiant";
    private final static String AJOUTER_FILIERE = "ajouterFiliere";
    //CONFIRMATIONS
    private final static String CONFIRMER_PROF = "confirmerProf";
    private final static String CONFIRMER_ETUDIANT = "confirmerEtudiant";
    private final static String CONFIRMER_FILIERE = "confirmerFiliere";

    private final static String HOME_JSP="/WEB-INF/accueil.jsp";
    public static final String ACTION = "action";
    public static final String EMPTY_STRING = "";
    public static final String AJOUTER_PROF_JSP = "/WEB-INF/Prof/ajouterProf.jsp";
    public static final String CONFIRMATION_PROF_JSP = "/WEB-INF/Prof/confirmerProf.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.traitementCommun(request,response);
    }

    private void traitementCommun(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter(ACTION);
        String urlCible = EMPTY_STRING;

        if(HOME.equals(action)) {
            urlCible = HOME_JSP;
        }

        if(AJOUTER_PROF.equals(action)) {
            urlCible = AJOUTER_PROF_JSP;
        } else {
            System.err.println("cle ??????"+action+"???");
        }

        if(CONFIRMER_PROF.equals(action)) {
            urlCible = CONFIRMATION_PROF_JSP;
        }

        if(!urlCible.equals(EMPTY_STRING)) {
            getServletContext().getRequestDispatcher(urlCible).forward(request, response);
        } else {
            System.err.println("cle ??????"+action+"???");
        }
    }
}