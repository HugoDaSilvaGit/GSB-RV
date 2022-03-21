package fr.gsb.appli_rv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import fr.gsb.appli_rv.entites.Rapport;

public class ListerRvActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lvRv;
    private TextView tvListeRv;
    private String mois;
    private String annee;
    private List<Rapport> ListRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_lister);

        lvRv =(ListView) findViewById(R.id.lvRv);
        tvListeRv =(TextView) findViewById(R.id.tvListeRv);

        ListRv = (List<Rapport>)getIntent().getSerializableExtra("ListRv");

        Context currentActivity = getApplicationContext();
        ArrayAdapter<Rapport> adapteur = new ArrayAdapter<Rapport>(
                currentActivity,
                android.R.layout.simple_list_item_1,
                ListRv
        );
        lvRv.setAdapter(adapteur);
        lvRv.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View listerRv, int i, long l) {
        Rapport rvSelectionne = ListRv.get(i);
        tvListeRv.setText(rvSelectionne.toString());
    }
}