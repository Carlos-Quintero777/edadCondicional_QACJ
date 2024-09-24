package com.example.edadcondicional_qacj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class denegadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_denegado);

        TextView lblMenor = findViewById(R.id.lblMenor);
        Button btnRechazado = findViewById(R.id.btnRechazado);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nombre = extras.getString("nombre");
            lblMenor.setText("Por favor, no me metas en problemas y largate " + nombre);
        }
        btnRechazado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(denegadoActivity.this, principalActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}