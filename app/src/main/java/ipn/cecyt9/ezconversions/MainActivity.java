package ipn.cecyt9.ezconversions;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonPesosDolar;
    private Button buttonOnzas;
    private Button buttonCirculo;
    private Button buttonWatts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPesosDolar = findViewById(R.id.ButtonPesosDolar);
        buttonOnzas = findViewById(R.id.button_onzas);
        buttonCirculo = findViewById(R.id.button_circulo);
        buttonWatts = findViewById(R.id.button_watts);

        buttonPesosDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPesosDolar();
            }
        });

        buttonOnzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirOnzas();
            }
        });

        buttonCirculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCirculo();
            }
        });

        buttonWatts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirWatts();
            }
        });



    }

    private void abrirPesosDolar() {
        Intent intent = new Intent(this , PesosDolar.class);
        startActivity(intent);
    }

    private void abrirOnzas() {
        Intent intent = new Intent(this , Onzas.class);
        startActivity(intent);
    }

    private void abrirCirculo() {
        Intent intent = new Intent(this , Circulo.class);
        startActivity(intent);
    }

    private void abrirWatts() {
        Intent intent = new Intent(this , Watts.class);
        startActivity(intent);
    }


}
