package fr.gsb.appli_rv.technique;

import fr.gsb.appli_rv.entites.Visiteur;

public class Session {
    private static Session session;
    private static Visiteur visiteur;

    private Session(Visiteur visiteur){
        Session.visiteur = visiteur;
    }

    public static void ouvrir(Visiteur visiteur) {
        if (session == null){
            session = new Session(visiteur);

        }
    }

    public static void fermer(){
        visiteur = null;
        session = null;
    }

    public static Session getSession() {
        return session;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public boolean estOuverte() {
        return session != null;
    }
}

