package fr.gsb.appli_rv;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.io.UnsupportedEncodingException;

import fr.gsb.appli_rv.Controller.VisiteurController;
import fr.gsb.appli_rv.technique.Session;

public class RechercherRvActivity extends AppCompatActivity {

    private Spinner spinnerMois, spinnerAnnee;
    private Button bAfficherRv;
    private String mois, annee, matricule;

    private static final String [] LesMois = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
    private static final String [] LesAnnees = {"2020","2021","2022","2023","2024","2025","2026"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_recherche);

        bAfficherRv = findViewById(R.id.bAfficherRv);
        spinnerMois = (Spinner) findViewById(R.id.spinnerMois);
        spinnerAnnee = (Spinner) findViewById(R.id.spinnerAnnee);

        Context currentActivity = getApplicationContext();
        ArrayAdapter<String> arrayAdapterMois = new ArrayAdapter<String>(
                currentActivity,
                android.R.layout.simple_spinner_dropdown_item,
                LesMois
        );
        ArrayAdapter<String> arrayAdapterAnnees = new ArrayAdapter<String>(
                currentActivity,
                android.R.layout.simple_spinner_dropdown_item,
                LesAnnees
        );

        arrayAdapterMois.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMois.setAdapter(arrayAdapterMois);
        spinnerMois.setSelection(0);
        arrayAdapterAnnees.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAnnee.setAdapter(arrayAdapterAnnees);
        spinnerAnnee.setSelection(2);

        bAfficherRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View AfficherRapports) {
                mois = spinnerMois.getSelectedItem().toString();
                annee = spinnerAnnee.getSelectedItem().toString();
                matricule = Session.getSession().getVisiteur().getMatricule();
                try {
                    Context currentActivity = getApplicationContext();
                    //ACTION
                    VisiteurController.getInstance().AfficherListeRapport(matricule,mois,annee,currentActivity);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
