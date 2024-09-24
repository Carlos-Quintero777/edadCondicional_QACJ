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

public class aceptadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        TextView lblMayor = findViewById(R.id.lblMayor);
        Button btnaceptado = findViewById(R.id.btnaceptado);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nombre = extras.getString("nombre");
            lblMayor.setText("¿Qué vas a decidir? " + nombre);
        }
        btnaceptado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aceptadoActivity.this, principalActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}