package controleur;

import modele.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 * Created by Fred on 15/09/2016.
 */
public class Controleur extends HttpServlet {

    /* REDIRECTION KEYS */
    private final static String HOME = "home";
    //AJOUTS
    private final static String AJOUTER_PROF = "ajouterProf";
    private final static String AJOUTER_ETUDIANT = "ajouterEtudiant";
    private final static String AJOUTER_FILIERE = "ajouterFiliere";
    //CONFIRMATIONS
    private final static String CONFIRMER_PROF = "confirmerProf";
    private final static String CONFIRMER_ETUDIANT = "confirmerEtudiant";
    private final static String CONFIRMER_FILIERE = "confirmerFiliere";
    //MODIFICATIONS
    public static final String MODIFIER_PROF = "modifierProf";

    private static final String ACTION = "action";
    private static final String EMPTY_STRING = "";

    private final static String HOME_JSP="/WEB-INF/accueil.jsp";

    private static final String AJOUTER_PROF_JSP = "/WEB-INF/Prof/ajouterProf.jsp";
    private static final String CONFIRMER_PROF_JSP = "/WEB-INF/Prof/confirmerProf.jsp";

    private static final String AJOUTER_ETUDIANT_JSP = "/WEB-INF/Etudiant/ajouterEtudiant.jsp";
    private static final String CONFIRMER_ETUDIANT_JSP = "/WEB-INF/Etudiant/confirmerEtudiant.jsp";

    private static final String AJOUTER_FILIERE_JSP = "/WEB-INF/Filiere/ajouterFiliere.jsp";
    private static final String CONFIRMER_FILIERE_JSP = "/WEB-INF/Filiere/confirmerFiliere.jsp";
    public static final String MODIFIER_PROF_JSP = "/WEB-INF/Prof/modifierProf.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.traitementCommun(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.traitementCommun(request,response);
    }

    private void traitementCommun(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter(ACTION);

        IFonctionnalites maFacade = (IFonctionnalites) this.getServletContext().getAttribute("maFacade");
        if(maFacade == null) {
            maFacade = new FonctionnalitesStaticVersion();
            this.getServletContext().setAttribute("maFacade", maFacade);
        }

        String urlCible = EMPTY_STRING;

        //ACCUEIL
        if(HOME.equals(action)) {
            urlCible = HOME_JSP;
        }

        //AJOUTER PROF
        if(AJOUTER_PROF.equals(action)) {
            urlCible = AJOUTER_PROF_JSP;
        } else {
            System.err.println("cle ??????"+action+"???");
        }

        //CONFIRMATION AJOUT PROF
        if(CONFIRMER_PROF.equals(action)) {
            urlCible = CONFIRMER_PROF_JSP;

            String nomProfesseur = request.getParameter("nomProfesseur");
            String prenomProfesseur = request.getParameter("prenomProfesseur");
            String jourNaissance = request.getParameter("jj");
            String moisNaissance = request.getParameter("mm");
            String anneeNaissance = request.getParameter("aaaa");

            Calendar calendar = Calendar.getInstance();
            calendar.set(Integer.parseInt(anneeNaissance),Integer.parseInt(moisNaissance),Integer.parseInt(jourNaissance));

            Prof professeurCree = maFacade.ajouterProfesseurBase(nomProfesseur, prenomProfesseur, calendar.getTime());

            request.setAttribute("professeurCree",professeurCree);

        } else {
            System.err.println("cle ??????"+action+"???");
        }

        //AJOUTER ETUDIANT
        if (AJOUTER_ETUDIANT.equals(action)) {
            urlCible = AJOUTER_ETUDIANT_JSP;
        } else {
            System.err.println("cle ??????"+action+"???");
        }

        //CONFIRMATION AJOUT PROF
        if(CONFIRMER_ETUDIANT.equals(action)) {
            urlCible = CONFIRMER_ETUDIANT_JSP;

            String nom = request.getParameter("nomEtudiant");
            String prenom = request.getParameter("prenomEtudiant");
            String numeroEtudiant = request.getParameter("numeroEtudiant");
            String jourNaissance = request.getParameter("jj");
            String moisNaissance = request.getParameter("mm");
            String anneeNaissance = request.getParameter("aaaa");

            Calendar calendar = Calendar.getInstance();
            calendar.set(Integer.parseInt(anneeNaissance),Integer.parseInt(moisNaissance),Integer.parseInt(jourNaissance));
            Etudiant etudiantCree = maFacade.ajouterEtudiantBase(Long.parseLong(numeroEtudiant),nom,prenom,calendar.getTime());

            request.setAttribute("etudiantCree",etudiantCree);
        } else {
            System.err.println("cle ??????"+action+"???");
        }

        //AJOUTER FILIERE
        if(AJOUTER_FILIERE.equals(action)) {
            urlCible = AJOUTER_FILIERE_JSP;
            Collection<Prof> lesProfs = maFacade.getProfsBase();
            request.setAttribute("lesProfs",new ArrayList<>(lesProfs));
        } else {
            System.err.println("cle ??????"+action+"???");
        }

        //CONFIRMATION FILIERE
        if(CONFIRMER_FILIERE.equals(action)) {
            urlCible = CONFIRMER_FILIERE_JSP;

            String libelleFiliere = request.getParameter("libelleFiliere");
            String idResponsable = request.getParameter("idProf");
            Annee anneeCreee = maFacade.creerFiliere(libelleFiliere, Integer.parseInt(idResponsable));
            request.setAttribute("anneeCreee",anneeCreee);

        } else {
            System.err.println("cle ??????"+action+"???");
        }

        //MODIFIER PROFESSEUR
        if(MODIFIER_PROF.equals(action)) {
            urlCible = MODIFIER_PROF_JSP;
            Collection<Prof> lesProfs = maFacade.getProfsBase();
            request.setAttribute("lesProfs",new ArrayList<>(lesProfs));
        } else {
            System.err.println("cle ??????"+action+"???");
        }

        //REDIRECTION VERS PAGE DE ACTION
        if(!urlCible.equals(EMPTY_STRING)) {
            getServletContext().getRequestDispatcher(urlCible).forward(request, response);
        } else {
            System.err.println("cle ??????"+action+"???");
        }
    }
}
