package fr.gsb.appli_rv.entites;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.Calendar;

public class Rapport implements Serializable {

    private String rap_bilan;
    private String pra_nom;
    private String pra_prenom;
    private String pra_cp;
    private String pra_ville;
    private Integer rap_num;
    private Integer pra_num;
    private String rap_date_visite;

    public Rapport(String vis_matricule, String rap_bilan, Integer rap_num, Integer pra_num, Motif mo_nummotif, Integer rap_coefconfiance, String rap_date_visite) {
        this.rap_bilan = rap_bilan;
        this.rap_num = rap_num;
        this.pra_num = pra_num;
        this.rap_date_visite = rap_date_visite;
    }

    public Rapport() {
    }

    public String getPra_nom() {
        return pra_nom;
    }

    public void setPra_nom(String pra_nom) {
        this.pra_nom = pra_nom;
    }

    public String getPra_prenom() {
        return pra_prenom;
    }

    public void setPra_prenom(String pra_prenom) {
        this.pra_prenom = pra_prenom;
    }

    public String getPra_cp() {
        return pra_cp;
    }

    public void setPra_cp(String pra_cp) {
        this.pra_cp = pra_cp;
    }

    public String getPra_ville() {
        return pra_ville;
    }

    public void setPra_ville(String pra_ville) {
        this.pra_ville = pra_ville;
    }

    public String getRap_bilan() {
        return rap_bilan;
    }

    public void setRap_bilan(String rap_bilan) {
        this.rap_bilan = rap_bilan;
    }

    public Integer getRap_num() {
        return rap_num;
    }

    public void setRap_num(Integer rap_num) {
        this.rap_num = rap_num;
    }

    public Integer getPra_num() {
        return pra_num;
    }

    public void setPra_num(Integer pra_num) {
        this.pra_num = pra_num;
    }

    public String getRap_date_visite() {
        return rap_date_visite;
    }

    public void setRap_date_visite(String rap_date_visite) {
        this.rap_date_visite = rap_date_visite;
    }

    @NonNull
    @Override
    public String toString() {
        return "Rapport{" +
                ", rap_bilan='" + rap_bilan + '\'' +
                ", pra_nom='" + pra_nom + '\'' +
                ", pra_prenom='" + pra_prenom + '\'' +
                ", pra_cp='" + pra_cp + '\'' +
                ", pra_ville='" + pra_ville + '\'' +
                ", rap_num=" + rap_num +
                ", pra_num=" + pra_num +
                ", rap_date_visite='" + rap_date_visite + '\'' +
                '}';
    }
}
