package fr.gsb.appli_rv.entites;

public class Motif extends Rapport{
    private int mo_nummotif;
    private String mo_libellemotif;

    public Motif(int mo_nummotif, String mo_libellemotif) {
        this.mo_nummotif = mo_nummotif;
        this.mo_libellemotif = mo_libellemotif;
    }

    public void setMo_nummotif(int mo_nummotif) {
        this.mo_nummotif = mo_nummotif;
    }

    public String getMo_libellemotif() {
        return mo_libellemotif;
    }

    public void setMo_libellemotif(String mo_libellemotif) {
        this.mo_libellemotif = mo_libellemotif;
    }
}
