package fr.gsb.appli_rv;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;

import fr.gsb.appli_rv.Controller.ConnexionController;

public class MainActivity extends AppCompatActivity {

    private Button bValider, bAnnuler;
    private TextView etmatricule, etmdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bValider = findViewById(R.id.bValider);
        bAnnuler = findViewById(R.id.bAnnuler);
        etmatricule = findViewById(R.id.etmatricule);
        etmdp = findViewById(R.id.etmdp);

        bValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LoginView) {
                String matricule = etmatricule.getText().toString();
                String mdp = etmdp.getText().toString();
                try {
                    Context currentActivity = getApplicationContext();
                    //ACTION
                    ConnexionController.getInstance().seConnecter(matricule, mdp, currentActivity);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });

        bAnnuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LoginView) {
                //ACTION
                System.exit(0);
            }
        });


    }
}