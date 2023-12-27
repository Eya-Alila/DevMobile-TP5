package com.example.eya_alila_mesure_glycemie.vue;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.eya_alila_mesure_glycemie.R;

public class ConsultActivity extends AppCompatActivity {
    private Button btnReturn;
    private TextView tvResult;
    private String reponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);
        init();
        Intent intent = getIntent();
        reponse = intent.getStringExtra("reponse");
        tvResult.setText(reponse);
        btnReturn.setOnClickListener(this::retour);
    }
    public void retour(View view) {
        // Créer une Intent pour lancer à nouveau l'Activité MainActivity
        Intent intent = new Intent(ConsultActivity.this, MainActivity.class);
        if (reponse != null)
            setResult(RESULT_OK);
        else
            setResult(RESULT_CANCELED);

        // Effacer toutes les activités de la pile avant de démarrer l'activité MainActivity
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        // Lancer à nouveau l'activité  MainActivity
        startActivity(intent);
    }
    private void init()
    {
        btnReturn = findViewById(R.id.btnReturn);
        tvResult = findViewById(R.id.tvResult);
    }
}


