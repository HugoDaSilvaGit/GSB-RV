package fr.gsb.appli_rv;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.UnsupportedEncodingException;
import java.util.Objects;

import fr.gsb.appli_rv.Controller.ConnexionController;
import fr.gsb.appli_rv.Controller.VisiteurController;
import fr.gsb.appli_rv.technique.Session;

public class MenuRvActivity extends AppCompatActivity {

    private Button bSaisirRDV, bConsulterRDV;
    private TextView twNom, twPrenom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        bSaisirRDV = findViewById(R.id.bSaisirRDV);
        bConsulterRDV = findViewById(R.id.bConsulterRDV);
        twNom = findViewById(R.id.twNom);
        twPrenom = findViewById(R.id.twPrenom);

        twNom.setText(Session.getSession().getVisiteur().getNom());
        twPrenom.setText(Session.getSession().getVisiteur().getPrenom());

        bConsulterRDV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View VisiteurView) {
                Context currentActivity = getApplicationContext();
                //ACTION
                VisiteurController.getInstance().ConsulterRapportDeVisite(currentActivity);
            }
        });

        bSaisirRDV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View VisiteurView) {
                Context currentActivity = getApplicationContext();
                //ACTION
                VisiteurController.getInstance().SaisirRapportDeVisite(currentActivity);
            }
        });

    }
}
