package com.example.edadcondicional_qacj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class principalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);

        txtnombre = findViewById(R.id.txtnombre);
        txtedad = findViewById(R.id.txtedad);
    }

    public void btnclick(View v){
        String nombre = txtnombre.getText().toString();
        String edadStr = txtedad.getText().toString();

        if (nombre.isEmpty() || edadStr.isEmpty()) {
            Toast.makeText(this, "Por favor, complete todos los campos.", Toast.LENGTH_SHORT).show();
            return;
        }

        int edad = Integer.parseInt(edadStr);

        Intent intent;
        if (edad >= 18) {
            intent = new Intent(this, aceptadoActivity.class);
        } else {
            intent = new Intent(this, denegadoActivity.class);
        }

        intent.putExtra("nombre", nombre);
        intent.putExtra("edad", edad);
        startActivity(intent);
    }
}