package com.example.eya_alila_mesure_glycemie.vue;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.eya_alila_mesure_glycemie.R;

public class HomeActivity extends AppCompatActivity {
    Button btnconsultation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        btnconsultation.setOnClickListener(this::consultation);
    }
    public void consultation(View view) {
        //intent sans retour

        // Créer une intent pour "lancer MainActivity"
        Intent intent=new Intent(HomeActivity.this,MainActivity.class);
        // Lancer MainActivity
        startActivity(intent);
        // Terminer l'activité actuelle (HomeActivity)
        finish();
    }
    private void init()
    {
        btnconsultation=findViewById(R.id.btnConsultation);
    }
}


